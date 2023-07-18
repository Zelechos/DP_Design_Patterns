package OCP.example_001;

public class DevelopApp extends DevelopSoftware{

    @Override
    public void Coding(ProgrammingLanguage programmingLanguage) {
        System.out.println("open android studio");
        System.out.println("App development will be done with => " + programmingLanguage.getName());
        System.out.println("deploy to Google apps");

    }
}
