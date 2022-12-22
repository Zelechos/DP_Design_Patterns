package factory;

import buttons.Button;
import buttons.MacButton;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }

}
