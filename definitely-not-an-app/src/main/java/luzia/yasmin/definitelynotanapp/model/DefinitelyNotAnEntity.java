package luzia.yasmin.definitelynotanapp.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Yasmin L
 * @since 29/04/2020 - 20:50
 * @version 1.0
 */
//SpringBOOT
@Component
//Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//JPA - Java Persistence API
@Entity
@Table(name = "client")
public class DefinitelyNotAnEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

}