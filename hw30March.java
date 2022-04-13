package HomeworkGeekster_28_March_To_09_April;
public class hw30March {
	
	public static void main(String args[]) {
		
		int a[] = {0,1,2,3,4,5,6,7,8};
		int []b= {2,7,11,15};
		int k=1656;
		
		int missingNum = findMissingNum(a);
		System.out.println(missingNum);
		
			twoSum(b,k);
		
	}
	
	
	public static int[] twoSum(int[] a, int k) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length;j++) {
			if(a[i]+a[j]==k) {
				System.out.println(i+" "+" "+(j));
				
			}
			else {
				System.out.println("Error");
			}
		}
		}
		return a;
		
		
	}
		private static int findMissingNum(int[] a) {
		
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
	

}