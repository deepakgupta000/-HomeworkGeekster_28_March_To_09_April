package HomeworkGeekster_28_March_To_09_April;

import java.util.Arrays;

public class hw_03_April
{
    // Function to find the majority element present in a given array
    public static int findMajorityElement(int[] nums)
    {
        // `m` stores the majority element (if present)
        int m = -1;
 
        // initialize counter `i` with 0
        int i = 0;
 
        // do for each element `nums[j]` in the array
        for (int j = 0; j < nums.length; j++)
        {
            // if counter `i` becomes 0
            if (i == 0)
            {
                // set the current candidate to `nums[j]`
                m = nums[j];
 
                // reset the counter to 1
                i = 1;
            }
 
            // otherwise, increment the counter if `nums[j]` is a current candidate
            else if (m == nums[j]) {
                i++;
            }
            // otherwise, decrement the counter if `nums[j]` is a current candidate
            else {
                i--;
            }
        }
 
        return m;
    }
    
    
    
    
    
    
       public  static void isAnagram(String str1, String str2) {  
            String s1 = str1.replaceAll("\\s", "");  
            String s2 = str2.replaceAll("\\s", "");  
            boolean status = true;  
            if (s1.length() != s2.length()) {  
                status = false;  
            } else {  
                char[] ArrayS1 = s1.toLowerCase().toCharArray();  
                char[] ArrayS2 = s2.toLowerCase().toCharArray();  
                Arrays.sort(ArrayS1);  
                Arrays.sort(ArrayS2);  
                status = Arrays.equals(ArrayS1, ArrayS2);  
            }  
            if (status) {  
                System.out.println(s1 + " and " + s2 + " are anagrams");  
            } else {  
                System.out.println(s1 + " and " + s2 + " are not anagrams");  
            }  
        }  
       
       
       
       private static void searchedElement(int[] a, int k) {
   		
   		int start =0;
   		int end = a.length-1;
   		
   		
   		while(start<=end) {
   			
   			int mid = start + (end - start)/2;
   			
   			int prev = (mid == 0)? a.length-1 : mid-1;
   			
   			int next = (mid == a.length-1)? 0: mid+1;
   			
   			
   			if(a[mid]==k) {
   				System.out.println("Found !");
   				break;
   			}
   			
   			else if(a[mid]>prev&&a[mid]<next) {
   				
   				start=mid+1;
   			}
   			else {
   				end=mid-1;
   				
   			}
   		}
   		System.out.println("Not Found !");
   		
   		
   	}

       
    
    
    //***********************************************************************************************8
 
    public static void main (String[] args)
    {
        // assumption: valid input (majority element is present)
        int[] nums = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
 
        System.out.println("The majority element is " + findMajorityElement(nums));
        
        System.out.println();
        
        isAnagram("razi", "zira");  
        isAnagram("Ajay", "Vijay"); 
        
        System.out.println();
        
        int[]a= {12,15,2,4,7,9};
		int k=7;
		
		
		searchedElement(a,k);
    }
}