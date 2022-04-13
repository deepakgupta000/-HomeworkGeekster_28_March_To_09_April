package HomeworkGeekster_28_March_To_09_April;

import java.util.Arrays;

public class hw_06_April {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[] = { 1, 3, 5, 7};
		int ar2[] = { 2, 4, 6, 8};
		int m = ar1.length;
		int n = ar2.length;
		merge(ar1, ar2, m, n);
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		int[][]arr1={ {0, 0, 0, 1},{0, 1, 1, 1},{1, 1, 0, 0},{0, 0, 0, 0}};
		
		System.out.println(rowWithMax1s(arr1));


	}

	private static int rowWithMax1s(int[][] arr1) {
		// TODO Auto-generated method stub
		
		int rowIndex = -1 ;
		int maxCount = 0 ;
		
		for(int i = 0 ; i < arr1.length ; i++){
			int count = 0 ;
			for(int j = 0 ; j < arr1[0].length  ; j++ ){
				if(arr1[i][j] == 1){
					count++ ;
				}
			}
			if(count > maxCount){
				maxCount = count ;
				rowIndex = i ;
			}
		}
		
		return rowIndex ;
		
	}

	private static void merge(int[] ar1, int[] ar2, int m, int n) {
		
		for (int i = n - 1; i >= 0; i--)
		{
			
			int j, last = ar1[m - 1];
			for (j = m - 2; j >= 0
				&& ar1[j] > ar2[i]; j--)
				ar1[j + 1] = ar1[j];

			if (j != m - 2 || last > ar2[i])
			{
				ar1[j + 1] = ar2[i];
				ar2[i] = last;
			}
		}
		
	}

}