package buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.print("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.print("Click!! Buttron says -> Hello World!!!");
    }
}
