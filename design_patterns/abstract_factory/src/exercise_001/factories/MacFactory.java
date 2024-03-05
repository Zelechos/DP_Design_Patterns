package exercise_001.factories;

import exercise_001.abstract_factory.IGUIFactory;
import exercise_001.abstract_products.IButton;
import exercise_001.abstract_products.ICheckbox;
import exercise_001.products.MacButton;
import exercise_001.products.MacCheckbox;

/**
 * Learn Abstract Factory Design Pattern
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-05
 */
public class MacFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
