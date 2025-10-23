import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter a number : ");
	    
	    int number = sc.nextInt();
	    
	    if(number%2==0){
   
	       System.out.print("It is a even number");
	  
	        
	    }
	    
	    else{
	            System.out.print("It is a odd number");
	        }
	    
	    
		
	}
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("It is an " + result + " number");
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if ((number & 1) == 0)
            System.out.println("It is an even number");
        else
            System.out.println("It is an odd number");
    }
}
