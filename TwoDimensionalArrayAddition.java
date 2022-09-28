package ArrayPackage;

import java.util.Scanner;

public class TwoDimensionalArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] number = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// System.out.println("Enter row size of array");
		// int row = sc.nextInt();
		// System.out.println("Enter column size of array");
		// int column = sc.nextInt();
		//
		// int[][] number = new int[row][column];
		//
		// for (int i = 0; i < number.length; i++) {
		// for (int j = 0; j < number[i].length; j++) {
		// System.out.println("Enter number::");
		// int num = sc.nextInt();
		// number[i][j] = num;
		// }
		// }

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.printf(number[i][j] + "\t");
			}
			System.out.println();
		}

		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				sum += number[i][j];
			}
		}
		System.out.printf("sum=%d", sum);

		System.out.println("\nEnter a number to multiply");
		// int value = sc.nextInt();
		int value = 3;

		int[][] product = new int[3][3];

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				product[i][j] = number[i][j] * value;
			}
		}

		System.out.println("---------------Product Matrix-------------------");
		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[i].length; j++) {
				System.out.printf(product[i][j] + "\t");
			}
			System.out.println();
		}

		int rowN = number.length;
		int colN = number[0].length;

		int rowProduct = product.length;
		int colProduct = product[0].length;

		if (rowN != rowProduct || colN != colProduct) {
			System.out.println("Array addition is not possible");
		}

		int[][] summation = new int[3][3];

		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[i].length; j++) {
				summation[i][j] = product[i][j] + number[i][j];
			}
			System.out.println();
		}

		System.out.println("---------------Addition of two Matrix-------------------");
		for (int i = 0; i < summation.length; i++) {
			for (int j = 0; j < summation[i].length; j++) {
				System.out.printf(summation[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
