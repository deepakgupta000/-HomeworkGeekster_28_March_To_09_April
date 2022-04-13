package HomeworkGeekster_28_March_To_09_April;

import java.io.*;
import java.lang.*;
import java.util.*;

public class hw_05_April {

	public static void main(String[] args) {
		
		 int a[] = {1,4,23,78,54,13,89};
	        int N = a.length;
	 
	        segregatePrimeNonPrime(a, N);
	        
	        
	        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	        int n = arr.length;
	        pushZerosToEnd(arr, n);
	        System.out.println();
	        System.out.println("Array after pushing zeros to the back: ");
	        for (int i=0; i<n; i++) {
	        	
	        	 System.out.print(arr[i]+" ");
	        	
	        }
	           
	        
	        System.out.println();
	    
	        int a1[] = { 2, 2, 2, 1, 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0, 0 };

			sort(a1);

			System.out.println(Arrays.toString(a1));
			
			
			String s = "madamm";
			
			System.out.println(isPalindrome(s));
	        
	}
	
	
	
	private static void sort(int[] a) {
		
		System.out.println();

		int count1 = 0;
		int count0 = 0;
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count0++;
			}

			else if (a[i] == 1) {
				count1++;
			}

			else {
				count2++;
			}

		}
		
		System.out.println("count0 : "+count0);
		System.out.println("count1 : "+count1);
		System.out.println("count2 : "+count2);


		for (int i = 0; i < count0; i++) {
			a[i] = 0;
		}

		System.out.println(count0);
		for (int i = count0; i < (count0+count1); i++) {
			a[i] = 1;
		}

		for (int i = count0+count1; i < a.length; i++) {
			a[i] = 2;
		}

	}
	
	
	public static boolean isPrime(int n)
		    {
		        if (n <= 1)
		            return false;
		 
		        if (n <= 3)
		            return true;
		 
		        if (n % 2 == 0 || n % 3 == 0)
		            return false;
		 
		        for (int i = 5; i * i <= n; i = i + 6) {
		 
		           
		            if (n % i == 0 || n % (i + 2) == 0)
		                return false;
		        }
		 
		        return true;
		    }
		 
		   
		    static void segregatePrimeNonPrime(int arr[], int N)
		    {
		       
		    	int left = 0, right = N - 1;
		 
		        
		        while (left < right) {
		 
		            while (isPrime(arr[left]))
		                left++;
		 
		            while (!isPrime(arr[right]))
		                right--;
		 
		            if (left < right) {
		 
		               
		                int temp = arr[right];
		                arr[right] = arr[left];
		                arr[left] = temp;
		 
		                left++;
		                right--;
		            }
		        }
		 
		        
		        for (int i = 0; i < N; i++)
		            System.out.print(arr[i] + " ");
		    }
		    
	public static void pushZerosToEnd(int arr[], int n)
		    {
		        int count = 0;  
		 
		        
		        for (int i = 0; i < n; i++)
		            if (arr[i] != 0)
		                arr[count++] = arr[i]; 
		        
		        
		        while (count < n)
		            arr[count++] = 0;
		    }
	
	
	public static boolean isPalindrome(String str)
	{
	    int left=0,right=str.length()-1;
	    while(left<right){
	        if(str.charAt(left) != str.charAt(right))
	            return false;
	         left++;
	         right--;     
	    }
	    return true;

	}
}