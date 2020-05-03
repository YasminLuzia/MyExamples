package luzia.yasmin.DependencyInjection;

import luzia.yasmin.DependencyInjection.interfaces.IPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Yasmin L
 * @since 16/04/2020 - 16:37
 * @version 1.0
 */
@Component
public class Pet {

//  Exemplo 1 (NÃO FAZER) - Classe Pet fortemente acoplada com a classe Cat e Dog. Requer entrar no códiggo e modificar a instanciação informando qual classe quer.
//  public void run(){
//      iPet = new Cat();
//      iPet.communicate();
//  }

//  Exemplo 2 - Baixo acoplamento. A aplicação envia a classe que deve ser instanciada por construtor.
//  public Pet(IPet iPet){
//      this.iPet = iPet;
//  }

    //  Exemplo 3 (Recomendado) - A Annotation @Autowired faz a injeção de dependência auto, sem precisarmos declarar o construtor.
    @Autowired
    @Qualifier("cat")
    private IPet iPet;

    public void run(){
        iPet.communicate();
    }

}