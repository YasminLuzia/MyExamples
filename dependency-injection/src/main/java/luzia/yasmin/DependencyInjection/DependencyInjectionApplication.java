package luzia.yasmin.DependencyInjection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Yasmin L
 * @since 16/04/2020 - 17:00
 * @version 1.0
 */
@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
//		Exemplo 3 (Recomendado) - Criamos uma variável ApplicationContext para ter o contexto de aplicação.
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
//		SpringApplication.run(DependencyInjectionApplication.class, args); (Para os exemplos 1 e 2)

		Pet pet = applicationContext.getBean(Pet.class);
		pet.run();

//		Exemplo 1 - Muda o objeto dentro do método e executa diretamente na classe. Muito acoplado!
//		Pet pet = new Pet();
//		pet.run();

		//Exemplo 2 - Reduz o acoplamento. Desta forma se envia o objeto no qual gostariamos de trabalhar.
//		Pet pet1 = new Pet(new Cat());
//		pet1.run();
//
//		Pet pet2 = new Pet(new Dog());
//		pet2.run();

	}

}