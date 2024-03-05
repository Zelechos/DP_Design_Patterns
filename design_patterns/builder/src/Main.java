import example.Person;


public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().name("alex").age(27).build();
        System.out.println("person.toString() = " + person.toString());

        System.out.println(Person.builder().name("ether").age(99).build().toString());
//        System.out.println("person.toString() = " + person.toString());
    }
}