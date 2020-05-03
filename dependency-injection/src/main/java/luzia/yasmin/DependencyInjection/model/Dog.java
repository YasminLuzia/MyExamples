package luzia.yasmin.DependencyInjection.model;

import luzia.yasmin.DependencyInjection.interfaces.IPet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Yasmin L
 * @since 16/04/2020 - 16:35
 * @version 1.0
 */
@Component
@Primary //Não é necessário para o exemplo utilizado atualmente
@Qualifier("dog")
public class Dog implements IPet {

    @Override
    public void communicate() {
        System.out.println("Bork bork");
    }

}