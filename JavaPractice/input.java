package JavaPractice;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Input your age = ");
        int age = sc.nextInt();
        System.out.println(age);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
