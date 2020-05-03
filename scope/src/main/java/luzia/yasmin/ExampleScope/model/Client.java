package luzia.yasmin.ExampleScope.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 14:23
 * @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Client {

    private String name;
}
