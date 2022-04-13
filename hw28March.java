package HomeworkGeekster_28_March_To_09_April;
public class hw28March {
	
	public static void main(String args[]) {
		int []a = {1,2,3,5,6,90,789};
		int []b={ 3,6,8};
		
		int k=0;
		
		//System.out.println(searchingNumber(a,k));
		
		//System.out.println("The cube root of a number is "+findCubeRoot(k));
		
		int idx=-1;
		int n=a.length;
		int nr=b.length;
	    for(int i=0;i<nr;i++){
	         idx = findIntersaction(a,idx+1,n,b[i]);
	         if(idx!=-1){
	             System.out.print(a[idx]+",");
	         }
	    }
	}

	private static int findIntersaction(int[] b,int start, int end, int num) {
		while(start<=end){
	        int mid = (start+end)/2;
	        if(b[mid]==num){
	            return mid;
	        }
	        else if(b[mid]>num){
	            end=mid-1;
	        }
	        else{
	            start=mid+1;
	        }
	    }
	    return -1;
	}

	private static int findCubeRoot(int k) {
		
		int start=0;
		int end=k;
		int ans = 0;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(k==mid*mid*mid) {
				return mid;
			}
			
			else if(k>mid*mid*mid) {
				start=mid+1;
				ans=mid;
			}
			else {
				end=mid-1;
			}
		}
		return ans;
		
		
	}

	private static int searchingNumber(int[] a, int k) {
		
		int start=0;
		int end=a.length-1;
		
		
		
		while(start<=end) {
			
		
			int mid = (start+end)/2;
		if(a[mid]==k) {
			return mid;
			
		}
		
		if(k>a[mid]) {
			start=mid+1;
		}
		
		else if(k<a[mid]) {
			end=mid-1;
			
		}
		
		
	
		
		}
		return -1;
		
	}
	}
