package luzia.yasmin.ExampleHelloWorld.model;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:31
 * @version 1.0
 */
public class Product {

    private String description;

    public Product(String description) {
        this.description = description;
    }

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                '}';
    }
}
