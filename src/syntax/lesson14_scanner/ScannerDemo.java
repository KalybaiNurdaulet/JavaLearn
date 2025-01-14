package syntax.lesson14_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("input,txt")); one type of use
        Scanner scanner = new Scanner(System.in); // System.in read from console
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println(name+ "   "+age);
    }
}
