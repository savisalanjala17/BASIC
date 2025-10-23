import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter first number : ");
	    
	    int number1 = sc.nextInt();
	    
	    System.out.print("Enter second number : ");
	    
	    int number2 = sc.nextInt();
	    
	    int result = (number1 > number2)?number1:number2;
	    
	    System.out.print(result+" is the greater number ");
	    

	}
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        
        if (number1 > number2) {
            System.out.println(number1 + " is the greater number");
        } else if (number2 > number1) {
            System.out.println(number2 + " is the greater number");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        
        int result = Math.max(number1, number2);
        
        if (number1 == number2)
            System.out.println("Both numbers are equal");
        else
            System.out.println(result + " is the greater number");
    }
}

