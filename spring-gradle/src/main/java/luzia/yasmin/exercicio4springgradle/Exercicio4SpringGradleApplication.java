package luzia.yasmin.exercicio4springgradle;

import luzia.yasmin.exercicio4springgradle.model.Quadrado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio4SpringGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio4SpringGradleApplication.class, args);

		Quadrado quadrado = new Quadrado();
		quadrado.setLado(5);

		System.out.println("Hello world!");
		System.out.println(quadrado.toString());
	}

}
