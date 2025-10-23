import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter a number : ");
	    
	    int number = sc.nextInt();
	    
	    if(number>=0){
	        if(number==0){
	            
	            System.out.print("number is  0");
	            
	        }
	        
	        else{
	            System.out.print("It is a positive number");
	        }
	    }
	    
	    else{
	            System.out.print("It is a negative number");
	        }
	    
	    
		
	}
}



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number is " + result);
    }
}



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = switch (Integer.signum(number)) {
            case 1 -> "Positive";
            case -1 -> "Negative";
            default -> "Zero";
        };

        System.out.println("The number is " + result);
    }
}
