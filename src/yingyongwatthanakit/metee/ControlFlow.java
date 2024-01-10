package yingyongwatthanakit.metee;

import java.util.Scanner;

public class ControlFlow {
	
	public static void main(String[] args) {
		// if, else if, else + Scanner + switch
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;

		System.out.print("Enter your name: ");
		name = scanner.nextLine();

		System.out.print("Enter your age: ");
		age = scanner.nextInt();

		// age < 20 - <name> can not drink beer
		// age >= 20 and age < 60 - <name> can drink beer
		// age >= 60 - <name> should go to sleep
		if (age < 20) {
			System.out.println(name + " can not drink beer :<");
		} else if (age >= 20 && age < 60) {
			System.out.println(name + " can drink beer :>");
		} else {
			System.out.println(name + " should go to sleep");
		}

		System.out.println("-----------------------");
		// Enter numerical command [0: exit, 1: print hello, 2: print random number]
		int commandNumber;
		System.out.print("Enter numerical command [0: exit, 1: print hello, 2: print random number]: ");
		commandNumber = scanner.nextInt();

		switch (commandNumber) {
			case 0:
				System.out.println("Exit the program...");
				// 0 success code
				// >= 1 <--> Error
				System.exit(0);
			case 1:
				System.out.println("Hello!");
				break;
			case 2:
				int randomNumber = 1 + (int)(Math.random() * 10);
				System.out.println("Random number: " + randomNumber);
				break;
			default:
				break;
		}

		// Grade.java - Input <score> -> 'A', 'B+', 'B'
		scanner.close();
	}

}
