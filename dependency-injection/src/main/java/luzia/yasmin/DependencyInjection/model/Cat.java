package luzia.yasmin.DependencyInjection.model;

import luzia.yasmin.DependencyInjection.interfaces.IPet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Yasmin L
 * @since 16/04/2020 - 16:33
 * @version 1.0
 */
@Component
@Qualifier("cat")
public class Cat implements IPet {

    @Override
    public void communicate() {
        System.out.println("Meow");
    }

}