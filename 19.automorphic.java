import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        // Find number of digits in num
        int digits = (int) Math.log10(num) + 1;

        // Get the last 'digits' digits of the square
        int lastDigits = square % (int) Math.pow(10, digits);

        if (lastDigits == num)
            System.out.println(num + " is an Automorphic Number.");
        else
            System.out.println(num + " is not an Automorphic Number.");
    }
}
