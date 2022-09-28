package Classwork;

import java.util.Scanner;

public class LargestNofArray2 {

	

			public static void main(String[] args) {
				System.out.println("Enter total numbers ");
				Scanner scan = new Scanner(System.in);
//				int count = scan.nextInt();
				
				int[]numbers = new int[] {15,4,0,2,1};
//				int numbers[] = new int[count];
				
//				for (int i = 0; i < numbers.length; i++) {
//					System.out.println("Enter any number");
//					int num = scan.nextInt();
//					numbers[i] = num;
		//	
//				}
				int largest = numbers[0];
				for (int i = 0; i < numbers.length; i++) {
					if(largest < numbers[i]) {
						largest = numbers[i];
					}
				}
				System.out.println(largest);
	}

}
