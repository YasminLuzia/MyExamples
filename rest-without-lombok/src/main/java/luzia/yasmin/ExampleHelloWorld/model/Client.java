package luzia.yasmin.ExampleHelloWorld.model;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:15
 * @version 1.0
 */
public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
