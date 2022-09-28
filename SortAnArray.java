package ArrayPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Elements the number we want to sort an array");
		Integer array[] = { 1, 5, 2, 7, 4,-2 };
        Integer a=10;
        
		Arrays.sort(array,Collections.reverseOrder());

		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);

		}
		for (int i = 0; i <= array.length - 1; i++) {
			array[i]=array[i]*-1;
		}
		Arrays.sort(array);

		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);

		}
		for (int i = 0; i <= array.length - 1; i++) {
			array[i]=array[i]*-1;
		}
		
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);

		}
	}
}
