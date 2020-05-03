package luzia.yasmin.ExampleHelloWorld.controller;

import luzia.yasmin.ExampleHelloWorld.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:30
 * @version 1.0
 */
@RestController
public class ProductController {

    @GetMapping("/products")
    public ArrayList<Product> getProducts(){
        Product product1 = new Product();
        product1.setDescription("A pen");

        Product product2 = new Product();
        product2.setDescription("A fork");

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        return products;
    }

    @GetMapping("/product")
    public Product getProduct(){
        Product product = new Product();
        product.setDescription("A pen");

        return product;
    }
}
