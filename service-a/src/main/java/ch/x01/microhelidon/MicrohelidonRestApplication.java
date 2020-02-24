package ch.x01.microhelidon;

import ch.x01.microhelidon.client.ClientController;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/data")
@ApplicationScoped
public class MicrohelidonRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        classes.add(ClientController.class);

        return classes;
    }
}
