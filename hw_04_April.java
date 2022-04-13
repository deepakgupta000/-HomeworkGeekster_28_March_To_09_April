package HomeworkGeekster_28_March_To_09_April;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hw_04_April {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 10, 8, 4, 1, 7 };

		int b[] = insertionSort(a);
		System.out.println(Arrays.toString(b));
		
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		  list.add(10); 
		  list.add(20); 
		  list.add(30);
		  list.add(40);
		  list.add(50);
		  list.add(60);
		 
		 System.out.println(list);
		 
		list.add(3, 15);
		 
		 System.out.println(list);
		 	
		 list2.addAll(list);
		 
		 System.out.println(list2);
		 
		 Collections.sort(list2,Collections.reverseOrder());
		 System.out.println(list2);

	}
	
	
	private static int[] insertionSort(int[] a) {

		// unsorted array loop
		int key = 0;
		for (int i = 1; i < a.length; i++) {
			key = a[i];

			int j = i - 1;

			// sorted array -> traverse, find the right position for key
			
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = key;

		}

		return a;

	}

}