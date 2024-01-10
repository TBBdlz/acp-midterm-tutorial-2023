package yingyongwatthanakit.metee;

import java.util.Scanner;

public class MethodDemo {

	static Scanner scanner = new Scanner(System.in); // class variable
	static final int MAX_ITER = 100000;
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = add(num1, num2);
		System.out.println(result);
		prettyPrintRange(num1, num2);
	}

	// static <return-type> <functionName>(arguments-with-data type)
	static int add(int number1, int number2) {
		return number1 + number2;
	}

	// method with no-return value
	static void prettyPrintRange(int lowerBound, int upperBound) {
		System.out.println("Range: [" + lowerBound + "," + upperBound + "]");
	}

}
