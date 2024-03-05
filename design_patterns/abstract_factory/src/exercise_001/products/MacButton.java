package exercise_001.products;

import exercise_001.abstract_products.IButton;

/**
 * Learn Abstract Factory Design Pattern
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 21.0.0 2024-03-05
 */
public class MacButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Paint Mac Button");
    }
}
