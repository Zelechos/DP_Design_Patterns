package buttons;

public class LinuxButton implements Button {

    @Override
    public void render() {
        System.err.print("test => Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.err.print("Happy Hacking");
    }
}
