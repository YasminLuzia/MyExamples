package luzia.yasmin.ExampleComponentScan;

import externalclasses.ClassDAO;
import externalclasses.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 15:08
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan("externalclasses")
public class ExampleComponentScanApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExampleComponentScanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("DAO Object: " + objectDAO1);
		System.out.println("JDBC Object: " + objectDAO1.getObjectJDBC());

	}

}
