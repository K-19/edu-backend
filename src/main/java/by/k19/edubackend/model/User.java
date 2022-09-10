package by.k19.edubackend.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String login;
    @NonNull
    private String password;
}
