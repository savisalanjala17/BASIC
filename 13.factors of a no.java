public class Factors {
    public static void printFactors(int num) {
        System.out.print("Factors of " + num + " are: ");
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int number = 36;
        printFactors(number);
    }
}



public class Factors {
    public static void printFactors(int num) {
        System.out.print("Factors of " + num + " are: ");
        
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    System.out.print(num / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int number = 36;
        printFactors(number);
    }
}
