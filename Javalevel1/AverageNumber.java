package Javalevel1;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num to find the average numbers::");
		int j = sc.nextInt();
		
		int i;
		float total = 0;
		for(i=1;i<=j;i++) {
			System.out.println("Enter the number"+i);
			
			int number = sc.nextInt();
			total = number + total;
			
		}
		System.out.println("the avg is"+total/j);
	}

}
