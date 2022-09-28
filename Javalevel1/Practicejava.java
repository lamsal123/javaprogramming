package Javalevel1;

public class Practicejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = { {2 , 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 } };
		int[][] matrix2 = { { 20, 24 }, { 28, 36 }, { 14, 48 } };
		
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
		
		if (mat1Column == mat2Row) {
			System.out.println("Invalid row column numbers. Matrix divide not possible");
			System.exit(0);
		}
		
		int[][] matDiv = new int[mat1Row][mat2Column];
		
		for (int i = 0; i < matrix1.length; i++) {
			int[] mat1RowValues = matrix1[i];
			
			for (int j = 0; j < matrix2[0].length; j++) {
				//				int mat2ColValues = matrix2[0][j];
				int sum = 0;
				
				for (int k = 0; k < matrix2.length; k++) {
					sum += matrix1[i][k] / matrix2[k][j];
				}
				matDiv[i][j] = sum;
				
			}
			
		}
		
		System.out.println("-----------------------Matrix- Division Result -------------------------------");
		for (int i = 0; i < matDiv.length; i++) {
			for (int j = 0; j < matDiv[i].length; j++) {
				System.out.printf(matDiv[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}


