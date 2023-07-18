package OCP.example_001;

public class DevelopGUI extends DevelopSoftware {
    @Override
    public void Coding(ProgrammingLanguage programmingLanguage) {
        System.out.println("creat a UI");
        System.out.println("creat a design templates");
        System.out.println("GUI development will be done with => " + programmingLanguage.getName());
    }
}
