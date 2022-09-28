package Classwork;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// Armstrong numbers

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any digit to check armstrong numbers");
		int rem = 0;
		int arm = 0;
		rem = scan.nextInt();
		int temp = rem;

		while (rem > 0) {
			int ld = rem % 10;
			arm = arm + ld * ld * ld;
			temp = temp / 10;
		}

		if (arm == rem) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}

	}

}
