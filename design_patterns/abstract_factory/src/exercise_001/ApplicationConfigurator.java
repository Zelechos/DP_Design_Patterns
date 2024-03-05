package exercise_001;

import exercise_001.abstract_factory.IGUIFactory;
import exercise_001.factories.MacFactory;
import exercise_001.factories.WinFactory;

import java.util.List;
import java.util.function.Supplier;

/**
 * Learn Abstract Factory Design Pattern
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-05
 */
public class ApplicationConfigurator {
    public static IGUIFactory factory;

    public static void main(String[] args) throws Exception {
        Supplier<String> getOSConnectedToMyNetwork = () -> List.of("Windows", "Macintosh", "Linux").get((int) (Math.random() * 3 + 0));
        String os = getOSConnectedToMyNetwork.get();
        System.out.println(os);

        try {
            if (os.equals("Windows")) factory = new WinFactory();
            if (os.equals("Macintosh")) factory = new MacFactory();
        } catch (Exception err) {
            throw new Exception("Error Unknown OS!!");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

}