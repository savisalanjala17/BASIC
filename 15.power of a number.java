public class Power {
    public static void main(String[] args) {
        double base = 2;
        double exponent = 5;

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}


public class Power {
    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        System.out.println(base + " raised to the power " + exponent + " is " + power(base, exponent));
    }
}


public class Power {
    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        System.out.println(base + " raised to the power " + exponent + " is " + power(base, exponent));
    }
}


public class Power {
    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        long half = power(base, exponent / 2);

        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;

        System.out.println(base + " raised to the power " + exponent + " is " + power(base, exponent));
    }
}
