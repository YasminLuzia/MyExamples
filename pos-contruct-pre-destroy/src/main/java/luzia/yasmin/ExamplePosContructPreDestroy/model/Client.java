package luzia.yasmin.ExamplePosContructPreDestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 13:30
 * @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client(){
        System.out.println("Class Client!");
    }
}
