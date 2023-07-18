package SRP.example_002;

import java.lang.reflect.Field;
import java.util.Date;

public class Course {

    private double price;
    private String name;

    private Date date;

    private boolean isCertified;

    @Offer(description = "course in offer", isOffer = true)
    private boolean isOffer;

    public Course() {
    }

    public Course(double price, String name, Date date, boolean isCertified, boolean isOffer) {
        this.price = price;
        this.name = name;
        this.date = date;
        this.isCertified = isCertified;
        this.isOffer = isOffer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCertified() {
        return isCertified;
    }

    public void setCertified(boolean certified) {
        isCertified = certified;
    }

    @Deprecated
    public void paymentGateway() {
        System.out.println("parment gateway");
    }

    @Deprecated
    public void addToCart() {
        System.out.println("add to the cart");
    }

    @Deprecated
    public void saveCourseInDB() {
        System.out.println("sabe course in DB");
    }

    public String getCourseOnOffer() throws NoSuchFieldException {
        Field offer = this.getClass().getDeclaredField("isOffer");
        Offer offers = offer.getAnnotation(Offer.class);
        return offers.description() + " -> " + offers.isOffer();
    }

}
