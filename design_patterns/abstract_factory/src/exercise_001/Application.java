package exercise_001;

import exercise_001.abstract_factory.IGUIFactory;
import exercise_001.abstract_products.IButton;
import exercise_001.abstract_products.ICheckbox;

public class Application {
    private final IGUIFactory factory;
    private IButton button;
    private ICheckbox checkbox;

    public Application(IGUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = this.factory.createButton();
        this.checkbox = this.factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
