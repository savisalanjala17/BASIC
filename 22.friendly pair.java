import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        double ratio1 = (double) sumOfDivisors(num1) / num1;
        double ratio2 = (double) sumOfDivisors(num2) / num2;

        if (ratio1 == ratio2)
            System.out.println(num1 + " and " + num2 + " are Friendly Pair numbers.");
        else
            System.out.println(num1 + " and " + num2 + " are not Friendly Pair numbers.");
    }

    // Method to find sum of divisors (including the number itself)
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
