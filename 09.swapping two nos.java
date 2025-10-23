public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);  // Output: a = 10, b = 5
    }
}


public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10

        System.out.println("a = " + a + ", b = " + b);  // Output: a = 10, b = 5
    }
}




public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + ", b = " + b);  // Output: a = 10, b = 5
    }
}



