package Classwork;

import java.util.Scanner;

public class ElementspecificIndex {

	public static void main(String[] args) {
		int[]arr=new int[5];
		System.out.println("Enter the elements");
		Scanner scan = new Scanner(System.in);
	
		int[]array1=new int[arr.length+1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Element which is insert");
         for(int i:arr) {
        	 System.out.println(i);
         }
       System.out.println(" Value of element we want to insert");
         int value =scan.nextInt();
         
          for(int i=arr.length;i>value;i--) {
        	  arr[i]=arr[i-1];
          }
          arr[value]=value;
          
          for(int i:arr) {
        	  System.out.println(i);
          }
	}

}
