package Javalevel1;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 10, 11 }, { 12, 13 }, { 14, 15 } };
		
		System.out.println("-----------------------Matrix-1 -------------------------------");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.printf(matrix1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------Matrix-2 -------------------------------");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.printf(matrix2[i][j] + "\t");
			}
			System.out.println();
		}
		
		int mat1Row = matrix1.length;
		int mat1Column = matrix1[0].length;
		
		int mat2Row = matrix2.length;
		int mat2Column = matrix2[0].length;
		
		if (mat1Column != mat2Row) {
			System.out.println("Invalid row column numbers. Matrix multiplication not possible");
			System.exit(0);
		}
		
		int[][] matMul = new int[mat1Row][mat2Column];
		
		for (int i = 0; i < matrix1.length; i++) {
			int[] mat1RowValues = matrix1[i];
			
			for (int j = 0; j < matrix2[0].length; j++) {
				//				int mat2ColValues = matrix2[0][j];
				int sum = 0;
				
				for (int k = 0; k < matrix2.length; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				matMul[i][j] = sum;
				
			}
			
		}
		
		System.out.println("-----------------------Matrix- Multiplication Result -------------------------------");
		for (int i = 0; i < matMul.length; i++) {
			for (int j = 0; j < matMul[i].length; j++) {
				System.out.printf(matMul[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	}

