package Classwork;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the numbers of row");
		int col = sc.nextInt();
		System.out.println("Enter the numbers of column");

		int matrix[][] = new int[row][col];
		int transpose[][] = new int[col][row];
		System.out.println();

		// print the input matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(matrix[i][j]);

			}
		}
		// print the transpose matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[i][j] = matrix[i][j];
			}
		}
		for (int[] r : transpose) {
			System.out.println(Arrays.toString(r));
			
		}

	}
}
