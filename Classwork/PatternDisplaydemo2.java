package Classwork;

public class PatternDisplaydemo2 {

	public static void main(String[] args) {

		 //                 *
		//				   ***
		//				  *****
		//				 *******
		//				*********
		//			   ***********
		//			  *************
		//			  		*
		//				   ***
		//				  *****
		//				 *******
		//				*********
		//			   ***********
		//			  **************
		//					*
		//					*
		//					*
		//					*
		//					*
		// First
		for(int k = 0; k<2; k++) {
			for(int l = 0;l<k;l++) {
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Second
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Third
		for (int i = 0; i < 5;i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}
}}
}
