package HomeworkGeekster_28_March_To_09_April;
public class hw29March {

	public static void main(String[] args) {

		// "1. Find the smallest missing element from a sorted array
		//  2. Find the missing term in a sequence in logarithmic time"
		
		int []a= {1,2,3,4,5,6,7,9};
		
		System.out.println(findSmallestElement(a));
		
		int[] nums = { 5, 7, 9, 11, 15 };
		 
        System.out.println("The missing term is " + findMissingTerm(nums));

	}

	private static int findSmallestElement(int[] a) {
		int start = 0;
		int end = a.length-1;
		
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			
			if(mid == 0)
			{
				return mid;
			}
			
			//When to return?
			if(a[mid]!=mid && a[mid-1]==mid-1)
			{
				return mid;
			}
			
			// If you  dont find the item, how to go right
			
			else if(a[mid]==mid)
			{
				start = mid +1;
			}
			//If you  dont find the item, how to go left?
			
			else
			{
				end = mid -1;
			}
		}
		return a.length;
	}
	
	
	    // Function to find a missing term in a sequence
	    public static int findMissingTerm(int[] nums)
	    {
	        // search space is nums[left…right]
	        int left = 0, right = nums.length - 1;
	 
	        // calculate the common difference between successive elements
	        int diff = (nums[nums.length - 1] - nums[0]) / nums.length;
	 
	        // loop till the search space is exhausted
	        while (left <= right)
	        {
	            // find the middle index
	            int mid = right - (right - left) / 2;
	 
	            // check the difference of middle element with its right neighbor
	            if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != diff) {
	                return nums[mid + 1] - diff;
	            }
	 
	            // check the difference of middle element with its left neighbor
	            if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != diff) {
	                return nums[mid - 1] + diff;
	            }
	 
	            // if the missing element lies on the left subarray, reduce
	            // our search space to the right subarray nums[left…mid-1]
	            if (nums[mid] - nums[0] != (mid - 0) * diff) {
	                right = mid - 1;
	            }
	 
	            // if the missing element lies on the right subarray, reduce
	            // our search space to the right subarray nums[mid+1…right]
	            else {
	                left = mid + 1;
	            }
	        }
	        return -1;
	    }
	 
		
	
	
	}