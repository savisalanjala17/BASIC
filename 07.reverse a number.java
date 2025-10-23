import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversed = 0;
        int temp = Math.abs(number); // handle negative numbers

        while (temp > 0) {
            int digit = temp % 10;        // get last digit
            reversed = reversed * 10 + digit;  // append digit
            temp /= 10;                   // remove last digit
        }

        // if original number was negative, add sign back
        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number is: " + reversed);
    }
}



import java.util.*;

public class Main {

    // Helper method to calculate number of digits
    public static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    // Recursive method to reverse number
    public static int reverseNumber(int n, int digits) {
        if (n == 0)
            return 0;
        int digit = n % 10;
        return digit * (int)Math.pow(10, digits - 1) + reverseNumber(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sign = (number < 0) ? -1 : 1;
        number = Math.abs(number);

        int digits = countDigits(number);
        int reversed = reverseNumber(number, digits) * sign;

        System.out.println("Reversed number is: " + reversed);
    }
}
