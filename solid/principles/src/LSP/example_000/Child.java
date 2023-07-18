package LSP.example_000;

public class Child extends Person{
    private Adult tutor;

    public Child(String name, String lastName, Adult tutor) {
        super(name, lastName);
        this.tutor = tutor;
    }

    public Adult getTutor(){
        return this.tutor;
    }

    public void setTutor(Adult tutor) {
        this.tutor = tutor;
    }
}
