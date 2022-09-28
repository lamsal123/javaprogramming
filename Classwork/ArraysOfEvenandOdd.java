package Classwork;

import java.util.Scanner;

public class ArraysOfEvenandOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[]= {2,3,4,5,6,8};
		System.out.println("Even numbers are");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+ "");
				
			}
		}
		System.out.println("Odd numbers are");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i] + "");
				
	}	
}
}}