package by.k19.edubackend;

import by.k19.edubackend.model.User;
import by.k19.edubackend.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class EduBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(EduBackendApplication.class, args);
	}
}
