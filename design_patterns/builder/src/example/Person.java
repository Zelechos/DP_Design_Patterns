package example;

public class Person {

    public String name;
    public int age;

    public static Person builder() {
        return new Person();
    }

    public String getName() {
        return name;
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }


    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return this;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

}
