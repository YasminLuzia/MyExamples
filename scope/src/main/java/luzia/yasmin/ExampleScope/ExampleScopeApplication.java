package luzia.yasmin.ExampleScope;

import luzia.yasmin.ExampleScope.dao.ClassDAO;
import luzia.yasmin.ExampleScope.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 14:27
 * @version 1.0
 */
@SpringBootApplication
public class ExampleScopeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExampleScopeApplication.class, args);

		//design pattern - SINGLETON
		ClassDAO classDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO classDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Class DAO 1: " + classDAO1);
		System.out.println("Class DAO 1 object: " + classDAO1.getObjectJDBC());
		System.out.println("Class DAO 2: " + classDAO2);
		System.out.println("Class DAO 2 object: " + classDAO2.getObjectJDBC());

		Client client = new Client();
		System.out.println(client);

		Client client1 = new Client();
		System.out.println(client1);
	}

}
