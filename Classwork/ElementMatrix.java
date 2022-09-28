package Classwork;

import java.util.Scanner;

public class ElementMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scan = new Scanner(System.in);
		 
		int matrix [][] = { { 2, 0, 3 }, { 2, 3, 1 }, { 1, 1, 1 } };
		System.out.println("Enter the number to find");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix [i][j] == y ) {
					
					System.out.println("Number in the index(" + i + ", " + j + " ).");
				}
			}
		}
		scan.close();
	}

}
