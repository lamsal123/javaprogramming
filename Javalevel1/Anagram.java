package Javalevel1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "Silent";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
//		check if the length is same
		char[]str1Array =str1.toCharArray();
		Arrays.sort(str1Array);
		System.out.println(str1Array);
		
		char[]str2Array =str2.toCharArray();
		Arrays.sort(str2Array);
		System.out.println(str2Array);
		
		str1 = String.valueOf(str1Array);
		str2 = String.valueOf(str2Array);
		
		if(str1. equals(str2)) {
			System.out.println("Both strings are anagram");
			
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}

}
