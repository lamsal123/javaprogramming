package Javalevel1;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int score = 0;
		int choice = 0;

		System.out.println("Q.1: What is the capital of Nepal?");
		System.out.println("1: India");
		System.out.println("2: Kathmandu");
		System.out.println("3: Bangladesh");
		System.out.println("4:Chitwan");

		System.out.println("Enter Your Answer");
		choice = scan.nextInt();

		if (choice == 2) {
			score++;
			System.out.print("Correct");
			System.out.println("Your score is" + (score++));
		} else {
			System.out.println("Wrong answer is" + score);
			System.exit(0);

		}
		System.out.println();
		System.out.println();
		
		System.out.println("Q:2.What is the height of mt everest?");
		System.out.println("1. 8848");
		System.out.println("2. 9848");
		System.out.println("3. 1048");
		System.out.println("4. 1148");
		System.out.println("Enter your answer:");
		int i = scan.nextInt();

		if (i == 1) {
			System.out.println("Correct");
			System.out.println("Your acore is" + 2);
		} else if (i != 1) {
			System.out.println("Incorrect");
			System.out.println("Your score is " + score++);
			System.exit(0);

		}
		System.out.println("Q:3.What is the capital Of NewZealand?");
		System.out.println("1.Bellington");
		System.out.println("2.Bristow");
		System.out.println("3.Wellington");
		System.out.println("Central Park");

		System.out.println("Enter your answer");
		int answer = scan.nextInt();

		if (answer == 3) {
			System.out.println("Correct");
			System.out.println("Your score is " + 2 + 1);
			System.out.println("Congratulations your Passed");
		} else if (answer != 3) {
			System.out.println("incorrect");
			System.out.println("Your score is " + 2);
			System.out.println("Sorry!You got failed.");
			System.exit(0);

		}
		scan.close();
	}
}
