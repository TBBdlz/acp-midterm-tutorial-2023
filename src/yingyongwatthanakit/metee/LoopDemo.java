package yingyongwatthanakit.metee;

import java.util.Scanner;

public class LoopDemo {
	
	public static void main(String[] args) {
		// for i in range(n): 
		//	do something...
		//
		// for (initialize: condition: inc/dec) { dosomething() }
		int dummy = 100;
		System.out.println("dummy");

		// for (int i = 0; i <= 10; i += 2) {
		// 	System.out.println(i);
		// }
		Scanner scanner = new Scanner(System.in);
		// int commandNum;
		// while (true) {
		// 	System.out.print("Enter 0 to exit... ");
		// 	commandNum = scanner.nextInt();
		// 	if (commandNum == 0) {
		// 		break;
		// 	}
		// }

		// for (int i = 0; i <= 10; i++) {
		// 	if (i % 2 == 0) continue;
		// 	System.out.println("did not skip iteration: " + i);
		// }

		int number = Integer.MIN_VALUE + 10;
		do {
			System.out.println("Get A : " + number);
			number--;
		} while (number > 0);

		

		scanner.close();
	}

}
