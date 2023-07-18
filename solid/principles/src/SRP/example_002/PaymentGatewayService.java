package SRP.example_002;

import SRP.example_000.User;

public class PaymentGatewayService {

    private Course course;
    private User user;
    private String accountType;

    public void verifyAccountType(){
        System.out.println("verifying account type");
    }

    public void verifyPaymentMethod(){
        System.out.println("verifying payment Method");
    }

    public void buyCourse(){
        System.out.println("buyCourse");
    }

    public void verifyUserInformation(User user, String accountType){
        System.out.println("verifying information");
    }

    public void cancelPurcharse(){
        System.out.println("the purcharse is cancelled");
    }


}
