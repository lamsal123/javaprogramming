package Javalevel1;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s = scan.nextLine();  
		// Welcome to Java
		int count=1;
		for(int i= 0; i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				count++;
			}
			
		}
		
		
	    
        System.out.println("Number of words in a string:"+count);
	}

}
        
