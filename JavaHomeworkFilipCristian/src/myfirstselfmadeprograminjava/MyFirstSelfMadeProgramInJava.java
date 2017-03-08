package myfirstselfmadeprograminjava;

import java.util.Scanner;

public class MyFirstSelfMadeProgramInJava {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Cum te cheama ?");
        System.out.print("Please type here: ");
        String name = scan.nextLine();
        System.out.println("Buna " + name + " ! Cati ani ai ?");
        System.out.print("Please type here: ");
        String age = scan.nextLine();
        System.out.println(age + " de ani este o varsta foarte frumoasa");
    }
}
