package example.buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.print("Click!! Buttron says -> Hello World!!!");
    }
}
