package Javalevel1;

import java.util.Scanner;

public class ConcatenateOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
int[] a = new int[] { 1, 2, 3 };
		
		int idx = 1;
		int element = 10;
		
		int[] insertResult = { 1, 10, 2, 3 };
		
		int[] b = new int[] { 4, 5 };
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int newArrayLength = a.length + b.length;
		int[] result = new int[newArrayLength];
		
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			int member = a[i];
			result[index] = member;
			index++;
		}
		
		System.out.println("Index value after appending array A::" + index);
		
		for (int i = 0; i < b.length; i++) {
			int member = b[i];
			//			result[a.length + i] = member;
			result[index] = member;
			//			index++;
		}
		
		System.out.println("----------Printing Result-----------");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	



	}


