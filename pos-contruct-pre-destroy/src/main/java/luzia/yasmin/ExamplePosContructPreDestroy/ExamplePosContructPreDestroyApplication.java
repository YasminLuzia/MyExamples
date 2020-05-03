package luzia.yasmin.ExamplePosContructPreDestroy;

import luzia.yasmin.ExamplePosContructPreDestroy.dao.ClientDAO;
import luzia.yasmin.ExamplePosContructPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 13:38
 * @version 1.0
 */
@SpringBootApplication
public class ExamplePosContructPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExamplePosContructPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Yasmin"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("Object Client in DAO: " + clientDAO.getClient());
	}

}
