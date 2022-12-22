package example.factory;

import example.buttons.Button;
import example.buttons.LinuxButton;

public class LunixDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
