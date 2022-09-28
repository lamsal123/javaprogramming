package Javalevel1;

public class IdentityMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[][] array2D = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
			
			//		int[] A = { 1, 0, 0, 0 };
			//		int[] B = { 1, 0, 0, 0 };
			//		int[] C = { 1, 0, 0, 0 };
			//		int[] D = { 1, 0, 0, 0 };
			//		
			//		int[][] array = { A, B, C, D };
			

			boolean isValid = true;
			
			int numberOfRows = array2D.length;
			int numberOfColumns = array2D[0].length;
			
			for (int i = 0; i < array2D.length; i++) {
				for (int j = 0; j < array2D[i].length; j++) {
					System.out.printf(array2D[i][j] + " ");
				}
				System.out.println();
			}
			
			//Condition 1: Number of rows and columns are equal
			if (numberOfRows == numberOfColumns) {
				
				for (int i = 0; i < array2D.length; i++) {
					for (int j = 0; j < array2D[i].length; j++) {
						//Condition 2: Check Diagnoal elements
//						if (i == j && array2D[i][j] == 1) {
//							continue;
//						}
						//					else if (i != j && array2D[i][j] == 0) {
						//						continue;
						//					} 
						//					else {
						//						isValid = false;
						//						break;
						//					}
						
						if ((i == j && array2D[i][j] != 1) || (i != j && array2D[i][j] != 0)) {
							isValid = false;
							break;
						}
						
						
					}
					System.out.println();
				}
			} else {
				isValid = false;
			}

			
			if (isValid) {
				System.out.println("The matrix is identity matrix");
			} else {
				System.out.println("the matrix is not identity matrix");
			}
			
		}
	}
