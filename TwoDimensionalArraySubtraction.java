package ArrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArraySubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] number = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println();
		System.out.println("Enter row size of array");
		int rows = sc.nextInt();
		System.out.println("Enter column size of array");
		int cols = sc.nextInt();

		// 2DArray
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];

		System.out.println("Enter the matrix 1");

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the matrix 2");

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				matrix2[i][j] = sc.nextInt();

			}
		}
		// print the matrix
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; i < number[i].length; j++) {
				System.out.print(matrix1[i][j]);
			}
		}
		System.out.println("print matrix 1");
		for (int[] array : matrix1) {
			for (int[] array1 : matrix2) {

			}
			System.out.println(Arrays.toString(array));
		}

		// System.out.println("print matrix 2");
		// for(int[]array :matrix2) {
		// System.out.println(arrays.toString(array));

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				number[i][j] = matrix1[i][j] - matrix2[i][j];
				System.out.print(number[i][j]);
			}
		}
	}
}
