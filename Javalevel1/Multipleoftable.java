package Javalevel1;

import java.util.Scanner;

public class Multipleoftable {

	public static void main(String[] args) {
		int number, i;
		Scanner scan = new Scanner(System.in);

	     System.out.println("Enter the number to print Multiplication table");
	     number=scan.nextInt();
	    	 for(i=1;i<=10;i++) {
//	    		 System.out.println(number+"*"+i+"="+(number*i));
	    		 System.out.printf("%d * %d =%d \n",number,i,number* i);
	     }

	}

}
