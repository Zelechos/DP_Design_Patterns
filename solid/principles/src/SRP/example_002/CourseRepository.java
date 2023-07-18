package SRP.example_002;


public class CourseRepository {

    public void save() {
        System.out.println("save course in DB");
    }

    public void delete() {
        System.out.println("delete course in DB");
    }

    public void put(String id) {
        System.out.println("update course in DB");
    }

    public void getById(String id) {
        System.out.println("get one course in DB");
    }

    public void getAll() {
        System.out.println("get all courses in DB");
    }
}
