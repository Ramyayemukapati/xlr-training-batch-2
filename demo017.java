import java.util.Scanner;

public class demo017 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        int tens = number / 10;  // Extract the tens digit
        int ones = number % 10;  // Extract the ones digit
        int sum = tens + ones;
       System.out.println(tens + " + " + ones + " = " + sum);
       scanner.close();
    }
}