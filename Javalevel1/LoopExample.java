package Javalevel1;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 1;
		while (i <= 100) {
			// System.out.println("Multiple of "+i);

			if (i % 7 == 0 || i % 5 == 0) {
				System.out.println("Multiple of " + i);
			}
			i++;
		}

	}

}
