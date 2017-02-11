package MyFirstSelfMadeProgramInJava;
import java.util.Scanner;

public class MyFirstSelfMadeProgramInJava {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your age ?");
        System.out.print("Please type here: ");
        String age = scan.nextLine();
        System.out.println("So your sge is " + age);
    }
}
