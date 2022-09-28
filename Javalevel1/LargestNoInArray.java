package Javalevel1;

import java.util.Scanner;

public class LargestNoInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array::");
		int j = sc.nextInt();
		int arr[] = new int[j];
		for (int i = 0; i < j; i++) {
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();
		}
		int large = arr[0];
		for (int i = 0; i < j; i++) {
			if(large<arr[i]) {
				large = arr[i];
			}
			
		}
		
		System.out.println("Largest number is " + large);
	}

}
