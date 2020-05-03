package luzia.yasmin.ExampleHelloWorld.controller;

import luzia.yasmin.ExampleHelloWorld.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Yasmin L
 * @since 17/04/2020 - 16:30
 * @version 1.0
 */
@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient(){
        Client client = new Client();
        client.setName("Yasmin");

        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients(){
        Client client1 = new Client();
        client1.setName("Yasmin");

        Client client2 = new Client();
        client2.setName("Joao");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
