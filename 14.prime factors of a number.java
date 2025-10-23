public class PrimeFactors {
    public static void printPrimeFactors(int num) {
        System.out.print("Prime factors of " + num + " are: ");

        // Print the number of 2s that divide num
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        // num must be odd at this point, so skip even numbers
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If num is a prime number greater than 2
        if (num > 2) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int number = 84;
        printPrimeFactors(number);
    }
}
