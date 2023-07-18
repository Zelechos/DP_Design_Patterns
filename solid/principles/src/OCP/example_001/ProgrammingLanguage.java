package OCP.example_001;

public class ProgrammingLanguage {

    private String name;

    private String paradigm;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(String name, String paradigm) {
        this.name = name;
        this.paradigm = paradigm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParadigm() {
        return paradigm;
    }

    public void setParadigm(String paradigm) {
        this.paradigm = paradigm;
    }
}
