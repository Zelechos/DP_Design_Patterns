package example.factory;

import example.buttons.Button;
import example.buttons.MacButton;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }

}
