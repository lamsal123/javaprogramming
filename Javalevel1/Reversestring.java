package Javalevel1;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "EYE";
		String rev = "";

		char a[] = str.toCharArray();
		int len = a.length;

		for (int i = len -1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reverse string is:" + rev);
		if(str.equals(rev)) {
			System.out.println("String is palindrome");
			
		}
		else{
			System.out.println("Stiring is not palindrome");
			
		}
	}

}
