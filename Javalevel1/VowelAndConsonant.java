package Javalevel1;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();
		char value[]= sentence.toCharArray();
		int vowel = 0;
		int consonant = 0;
		for(int i = 0; i<sentence.length();i++) {
			
			if (value[i] >= 'A' && value[i] <= 'Z' || value[i] >= 'a' && value[i] <= 'z') {
		}
		if(value[i]=='a'|| value[i]=='e' || value[i]=='i'|| value[i]=='o'|| value[i]=='u') {
			vowel++;
			
			}
		else {
			consonant++;
		}
		
    System.out.println("The vowel words in a sentence are" +vowel);
    System.out.println("The consonant words in asentence are"+consonant);
		}
	}
	
}
	

	
