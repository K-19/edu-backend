package by.k19.edubackend;

import by.k19.edubackend.model.User;
import by.k19.edubackend.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class LoadDatabaseRunner {

    @Bean
    public CommandLineRunner loadDatabase(UserRepository repository) {
          return args -> {
              if (repository.findAll().isEmpty()) {
                  log.info("Загрузка дефолтного пользователя: " + repository.saveAndFlush(new User("login", "password")));
                  log.info("Загрузка дефолтного пользователя: " + repository.saveAndFlush(new User("k19", "k19")));
              }
          };
    }
}
