package exercises.exercise_001.src;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashCode hash = HashCode.getInstance();
        System.out.println(hash.generateHashCode());
//        render();

    }

    public static void render(){
        Record record = Record.getInstance("message: welcome tu false git log --oneline","6wo2h394");
        Scanner input = new Scanner(System.in);
        do{
            record.renderLog();
            System.out.println("Insert message of commit :\t");
            record.setLog(input.nextLine());
            System.out.println("Insert hashcode of commit :\t");
            record.setHashCode(input.nextLine());
        }while(true);

    }
}
