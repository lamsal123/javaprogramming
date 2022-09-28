package Classwork;

public class NumberPattern3 {
//       1
//       33
//      555
//      7777
//      99999

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				
				if (i % 2 != 0) {
					System.out.print(i);
				}
			}
			
			if (i % 2 != 0) {
				System.out.println();
			}

		}
		for (int i = 0; i <= 10; i--) {
			for (int j = 1; j <= i; j++)

				System.out.print(i);
		}
		System.out.println();
	}

}
