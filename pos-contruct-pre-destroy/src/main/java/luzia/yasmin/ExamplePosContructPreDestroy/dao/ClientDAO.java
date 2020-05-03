package luzia.yasmin.ExamplePosContructPreDestroy.dao;

import lombok.Getter;
import lombok.Setter;
import luzia.yasmin.ExamplePosContructPreDestroy.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 13:32
 * @version 1.0
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postContruct(){
        System.out.println("Project created!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Project ended!");
    }
}
