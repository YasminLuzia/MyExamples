package luzia.yasmin.ExampleScope.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Yasmin L
 * @since 19/04/2020 - 14:30
 * @version 1.0
 */
@Component
//Example 1
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Example 2
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
//          proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC(){
        System.out.println("Class JDBC!");
    }
}
