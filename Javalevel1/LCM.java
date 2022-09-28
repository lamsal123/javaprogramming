package Javalevel1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First Number");
	        int n1 = sc.nextInt();
	        System.out.println("Enter Second Number");
	        int n2 = sc.nextInt();
	        // find GCD between n1 and n2
	        // initially set to gcd
	        int gcd = 1;
	        for (int i = 1; i <= n1 && i <= n2; i++) {

	            // check if i perfectly divides both n1 and n2
	            if (n1 % i == 0 && n2 % i == 0) gcd = i;
	        }
	        int lcm= (n1*n2)/gcd;
//	        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	        System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm); 
	    }
	
	}


