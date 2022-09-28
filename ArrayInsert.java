package ArrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 2, 3, 2, 4, 2 };
		
		int newSize = a.length + 1;
		
		int[] newArray = new int[newSize];
		
		System.out.println("Enter value to insert::");
		int value = sc.nextInt(); //10
		
		System.out.println("Enter index to insert::");
		int index = sc.nextInt(); //5
		
		//		System.out.println(Arrays.toString(a));
		
		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (index == idx) {
				newArray[idx] = value;
				
				idx = idx + 1;
				
				newArray[idx] = a[i];
			} else {
				newArray[idx] = a[i];
			}
			
			idx++;
		}
		
		System.out.println("Old Array::" + Arrays.toString(a));
		System.out.println("New Array::" + Arrays.toString(newArray));
		sc.close();
	}
	


	

}
