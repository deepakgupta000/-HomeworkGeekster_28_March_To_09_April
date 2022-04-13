package HomeworkGeekster_28_March_To_09_April;
import java.util.Scanner;

public class hw_08_April {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner cs=new Scanner(System.in);
		 int num1=1,num2;
		    System.out.print("Enter your Limit:");
		 num2=cs.nextInt();
		    System.out.print("All odd number given range are:");
		 odd(num1,num2);
	         cs.close();
	         
	         
	         int i,fact=1;  
	  		int number=4;//It is the number to calculate factorial 
	  		
	  		fact = factorial(number);   
	  		System.out.println("Factorial of "+number+" is: "+fact);  
	  		
	  		
	  		int base = 3, powerRaised = 4;
	  	    int result = power(base, powerRaised);

	  	    System.out.println(base + "^" + powerRaised + "=" + result);
	  	    
	  	    
	  	    String s ="Ajay";
	  	    System.out.print(reverseString(s));
	  		
	  		
	  		

	}
	
	public static int odd(int num1, int num2)
	{
		 if(num1>num2)
			    return 0;
			   System.out.printf(num1+" ");
			return odd(num1+2,num2);
		}
	
	
	
	
	public static int factorial(int n)
 	{    
 		if (n == 0)    
 			return 1;    
 		else    
 			return(n * factorial(n-1));    
 	}
	
	
	public static int power(int base, int powerRaised) {
	    if (powerRaised != 0) {

	      // recursive call to power()
	      return (base * power(base, powerRaised - 1));
	    }
	    else {
	      return 1;
	    }
	  }
	


	public static String reverseString(String str) {  
	  
	if(str.isEmpty()) 
	{  
		System.out.println("String is empty."); 
		return str;  
	}   
	else   
	{  
		return reverseString(str.substring(1))+str.charAt(0);  
	}  

}
}