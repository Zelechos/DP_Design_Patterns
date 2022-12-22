package example;

import example.factory.*;

public class Demo_example {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBussinesLogic();
    }

    static void configure() {
        String os = "Web";

        if (os.equals("Windows 11")) {
            dialog = new WindowsDialog();
        }

        if (os.equals("Web")) {
            dialog = new HtmlDialog();
        }

        if (os.equals("Linux")) {
            dialog = new LunixDialog();
        }

        if (os.equals("Mac")) {
            dialog = new MacDialog();
        }
    }

    static void runBussinesLogic(){
        dialog.renderWindow();
    }
}
