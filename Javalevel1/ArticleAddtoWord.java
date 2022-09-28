package Javalevel1;

import java.util.Scanner;

public class ArticleAddtoWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any words");
		String word = scan.nextLine();
		if(word.charAt(0)=='a'  || word.charAt(0)=='e' || word.charAt(0)=='i'  || word.charAt(0)== 'o');{
			
           word = "an"+word;
		}
		
		System.out.println("word");
			
		}
	} 


