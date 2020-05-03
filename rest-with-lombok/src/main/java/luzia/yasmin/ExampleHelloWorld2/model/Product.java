package luzia.yasmin.ExampleHelloWorld2.model;

import lombok.*;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:53
 * @version 1.0
 */
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Product {

    private String description;
    private double price;

}
