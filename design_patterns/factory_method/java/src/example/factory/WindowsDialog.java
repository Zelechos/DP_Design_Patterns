package example.factory;

import example.buttons.Button;
import example.buttons.WindowsButton;
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
