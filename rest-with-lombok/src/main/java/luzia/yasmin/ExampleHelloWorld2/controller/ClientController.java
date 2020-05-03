package luzia.yasmin.ExampleHelloWorld2.controller;

import luzia.yasmin.ExampleHelloWorld2.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:44
 * @version 1.0
 */
@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient(){
        Client client = new Client();
        client.setName("Yasmin");
        client.setEmail("yasmin.s.luzia@gmail.com");

        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients(){
        Client client1 = new Client();
        client1.setName("Yasmin");
        client1.setEmail("yasmin.s.luzia@gmail.com");

        Client client2 = new Client();
        client2.setName("Joao");
        client2.setEmail("jooap@gmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
