package OCP.example_001;

public class DevelopAI extends DevelopSoftware{
    @Override
    public void Coding(ProgrammingLanguage programmingLanguage) {
        System.out.println("create a dataset");
        System.out.println("AI development will be done with => " + programmingLanguage.getName());
        System.out.println("create a model");
        int epochs = 0;
        do{
            System.out.println("training the IA model");
            epochs++;
        }while (epochs < 10);
    }
}
