import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter a number : ");
	    
	    int number = sc.nextInt();
	    
	    int sum=0;
	    
	    for(int i=1;i<=number;i++){
	        
	        sum+=i;
	    }
	    
	    System.out.print("The sum of first n natural numbers is "+sum);
	    
	    
		
	}
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of first " + number + " natural numbers is " + sum);
        }
    }
}


import java.util.*;

public class Main {
    
    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;  // Base case
        } else {
            return n + sumOfNaturalNumbers(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = sumOfNaturalNumbers(number);
            System.out.println("The sum of first " + number + " natural numbers is " + sum);
        }
    }
}
