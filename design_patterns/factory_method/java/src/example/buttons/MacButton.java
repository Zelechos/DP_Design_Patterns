package example.buttons;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Welcome Again");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("</Hello Macintosh>");
    }
}
