package exercise_001.abstract_factory;

import exercise_001.abstract_products.IButton;
import exercise_001.abstract_products.ICheckbox;

/**
 * Learn Abstract Factory Design Pattern
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-05
 */
public interface IGUIFactory {
    IButton createButton();

    ICheckbox createCheckbox();

}
