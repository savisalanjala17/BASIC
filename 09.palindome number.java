public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;        // Get the last digit
            reversed = reversed * 10 + digit;  // Build reversed number
            num = num / 10;              // Remove last digit
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 121;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
    }
}


public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        // Negative numbers are not palindrome
        if (num < 0) return false;

        // Find the divisor to extract the leading digit
        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;
        }

        while (num != 0) {
            int leading = num / divisor;   // Most significant digit
            int trailing = num % 10;       // Least significant digit

            if (leading != trailing) {
                return false;
            }

            // Remove leading and trailing digits from num
            num = (num % divisor) / 10;

            // Adjust divisor by removing two digits
            divisor = divisor / 100;
        }

        return true;
    }

  public class PalindromeCheck {
    // Helper method to count digits
    public static int countDigits(int num) {
        if (num == 0) return 0;
        return 1 + countDigits(num / 10);
    }

    public static boolean isPalindromeUtil(int num, int digits) {
        // Base case
        if (num == 0) return true;

        int leadingDivisor = (int) Math.pow(10, digits - 1);
        int leading = num / leadingDivisor;
        int trailing = num % 10;

        if (leading != trailing) return false;

        // Remove leading and trailing digits
        num = (num % leadingDivisor) / 10;

        return isPalindromeUtil(num, digits - 2);
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;  // negative numbers not palindrome
        int digits = countDigits(num);
        return isPalindromeUtil(num, digits);
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println(number + " is palindrome? " + isPalindrome(number));
    }
}


    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
    }
}


public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println(number + " is palindrome? " + isPalindrome(number));
    }
}


