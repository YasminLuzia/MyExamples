package luzia.yasmin.ExampleHelloWorld2.controller;

import luzia.yasmin.ExampleHelloWorld2.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:53
 * @version 1.0
 */
@RestController
public class ProductController {

    @GetMapping("/product")
    public Product getProduct(){
        Product product = new Product();
        product.setDescription("Hamburger");
        product.setPrice(1.0);

        return product;
    }

    @GetMapping("/products")
    public ArrayList<Product> getClients(){
        Product product1 = new Product();
        product1.setDescription("Hamburger");
        product1.setPrice(1.0);

        Product product2 = new Product();
        product2.setDescription("Water");
        product2.setPrice(0.5);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        return products;
    }

}
