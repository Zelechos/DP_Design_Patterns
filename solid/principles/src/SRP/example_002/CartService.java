package SRP.example_002;

import java.util.List;

public class CartService {
    public void addToCart() {
        System.out.println("add to the cart");
    }

    public void deleteToCart() {
        System.out.println("delete to the cart");
    }

    public List<String> getAllCoursesToCart() {
        System.out.println("get all courses to the cart");
        return List.of("ia course", "java course");
    }

    public String getCourseOfCart(String courseName) {
        System.out.println("get one course to the cart");
        return courseName;
    }

    //...
}
