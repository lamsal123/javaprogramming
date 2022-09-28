package Classwork;

import java.util.Scanner;

public class CountVowelandConsonantInteger {

	public static void main(String[] args) {
		
		System.out.println("Enter any word");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		char value[] = word.toCharArray();
		
		int vowel = 0;
		int consoant = 0;
		int countNum = 0;
		int countSymbol = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (value[i] >= 'A' && value[i] <= 'Z' || value[i] >= 'a' && value[i] <= 'z') {
				
				if (value[i] == 'a' || value[i] == 'e' || value[i] == 'i' || value[i] == 'o' || value[i] == 'u') {

					vowel++;

				}
				

				else {
					consoant++;

				}
				

			}
			else if (value[i] >= '0' && value[i] <= '9') {
				countNum++;
			} else {
				countSymbol = countSymbol + 1;
			}

		}
		System.out.println("vowels words in sentence are " + vowel);
		System.out.println("Consonant words in sentence are " + consoant);
		System.out.println("Numbers in words are " + countNum);
		System.out.println("Symbols in words  are " + countSymbol);

	}


	}


