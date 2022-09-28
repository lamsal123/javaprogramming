package ArrayPackage;

import java.util.Scanner;

public class QuizArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int score = 0;
		int choice = 0;
       String questions="A.Which is the largest river in the world?";
    	  
       String[]answers1 ={"1.Karnali","2.Nile","3.Kaligandaki","4.Narayani"};
       
//   	System.out.println("A.Which is the largest river in the world?");
	//	System.out.println("1.Karnali");
	//	System.out.println("2.Nile"); 
	//	System.out.println("3.Kaligandaki");
	//	System.out.println("4.Narayani");

		System.out.println("Enter your answer");

		if (choice == 2) {
			score++;
			// score=score+1
			// score++;
			System.out.print("Corect ");
			System.out.println("Your score is " + (score++));
		} else {
			System.out.println("Wrong answer" + score);
			System.exit(0);
		}
		String questions1 ="B: Which is the largest country in the world?";
		
	    String[]answer2 = {"1.India","2.Canada","3.Russia","4.China"};
	    
	//	System.out.println("B: Which is the largest country in the world?");
	//	System.out.println("1.India");
	//	System.out.println("2.Canada");
	//	System.out.println("3.Russia");
	//	System.out.println("Enter your answer");
	    
		int ans2 = scan.nextInt();

		if (ans2 == 3) {
			System.out.println("Correct");
			System.out.println("Your score is" + 2);
		} else if (ans2 != 3) {
			System.out.println("Wrong answer");
			System.out.println("Your score is" + score++);
			System.exit(0);
		}
		System.out.println();

		System.out.println("C.What is the tallest animal in the world?");
		System.out.println("1. Tiger");
		System.out.println("2.Girrafe");
		System.out.println("3.lion");
		System.out.println("4.Deer");
		System.out.println("Enter your answer");
		int ans3 = scan.nextInt();

		if (ans3 == 2) {
			System.out.println("Correct");
			System.out.println("Your score is" + 2);
		} else if (ans3 != 2) {
			System.out.println("Wrong answer");
			System.out.println("Your score is " + score++);
			System.exit(0);
		}
		System.out.println();

		System.out.println("D. Which is the largest state in the US?");
		System.out.println("1. Arizona");
		System.out.println("2. Virginia");
		System.out.println("3. Texas");
		System.out.println("4. Alaska");
		System.out.println("Enter your answer :");
		int ans5 = scan.nextInt();

		if (ans5 == 4) {
			System.out.println(" That's Correct ");
			System.out.println(" Your score is " + 5);
			System.out.println(" Great!! YOU WON");
		} else if (ans5 != 4) {
			System.out.println(" Wrong Answer ");
			System.out.println(" Your score is " + 2);
			System.exit(0);
		}
		scan.close();

	}
}
