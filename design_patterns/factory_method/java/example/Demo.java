import factory.Dialog;
import factory.HtmlDialog;
import factory.LunixDialog;
import factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBussinesLogic();
    }

    static void configure(){
        String os = "Windows 11";

        if(os.equals("Windows 11")){
            dialog = new WindowsDialog();
        }

        if(os.equals("Web")){
            dialog = new HtmlDialog();
        }

        if(os.equals("Linux")){
            dialog = new LunixDialog();
        }
    }

    static void runBussinesLogic(){
        dialog.renderWindow();
    }
}
