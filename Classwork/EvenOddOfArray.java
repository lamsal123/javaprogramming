package Classwork;

public class EvenOddOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even numbers in array");//2,4,6,8
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0)
				System.out.println(a[i]);
		}
		System.out.println("Odd numbers in array");//1,3,5,7
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0)
				System.out.println(a[i]);
		}
	}

}
