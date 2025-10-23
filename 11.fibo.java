public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        
        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 10;  // number of terms
        printFibonacci(n);
    }
}


public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci series (recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}


public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
