package HomeworkGeekster_28_March_To_09_April;

import java.util.Scanner;

public class hw_09_April {
	
	
	
	 static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 
	 
	 
	 
	 
	 
	 
	 public static int fib(int n)
	    {
	        if (n <= 1) {
	            return n;
	        }
	 
	        return fib(n - 1) + fib(n - 2);
	    }
	 
	 
	 private static int calculateSum(int arr[], int n) {
		 
         //base or terminating condition
         if (n <= 0) {
            return 0;
          }
 
          //Calling method recursively
          return calculateSum(arr, n-1 ) + arr[n-1];
       }
	 
	 
	 
	 


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of fibbo series");
			
			
			int count=sc.nextInt();    
			  System.out.print(n1+" "+n2);//printing 0 and 1    
			  printFibonacci(count-2);//n-2 because 2 numbers are already printed  
			  
			  
			  System.out.println("Enter the nth fibo number");
			  int n = sc.nextInt();
			  
		        System.out.println("F(n) = " + fib(n));
		        
		        
		        int arr[] = {2, 5, 6, 8, 9, 12};
		         int sum = calculateSum(arr, arr.length);
		 
		          System.out.println(sum);
	}
	
}