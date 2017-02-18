package MyFirstSelfMadeProgramInJava;

import java.util.Scanner;

public class MyFirstSelfMadeProgramInJava {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Cum te cheama ?");
        System.out.print("Please type here: ");
        String name = scan.nextLine();
        System.out.println("Buna " + name + " ! Cati ani ai ?");
    }
}
