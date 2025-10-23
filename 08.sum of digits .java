import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;  // get last digit
            sum += digit;           // add to sum
            temp /= 10;             // remove last digit
        }

        System.out.println("The sum of digits of " + number + " is " + sum);
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(number); // convert to positive

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("The sum of digits of " + number + " is " + sum);
    }
}


import java.util.*;

public class Main {

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return Math.abs(n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The sum of digits of " + number + " is " + sumOfDigits(number));
    }
}
