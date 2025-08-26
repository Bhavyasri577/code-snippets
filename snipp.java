import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;            // get last digit
            reversed = reversed * 10 + digit;   // build reversed number
            number /= 10;                       // remove last digit
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}
