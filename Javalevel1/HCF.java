package Javalevel1;

import java.util.Scanner;

public class HCF {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First Number");
	        int n1 = sc.nextInt();
	        System.out.println("Enter Second Number");
	        int n2 = sc.nextInt();
	        // find GCD between n1 and n2
	        // initially set to gcd
	        int hcf = 1;
	        for (int i = 1; i <= n1 || i <= n2; i++) {

	            // check if i perfectly divides both n1 and n2
	            if (n1 % i == 0 && n2 % i == 0) hcf = i;
	        }

	        System.out.println("GCD of " + n1 + " and " + n2 + " is " + hcf); 
	    }
	}
	