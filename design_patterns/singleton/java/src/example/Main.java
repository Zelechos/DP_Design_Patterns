package example;


public class Main {
    public static void main(String[] args) {

        Record record = Record.getInstance("hello");
        System.out.println(record.log); // null
        System.out.println(record.getLog()); //null
        record.setLog("link");
        System.out.println(record.getLog()); // link
        Record record1 = Record.getInstance("actual");
        System.out.println(record1.getLog()); // link

    }
}
