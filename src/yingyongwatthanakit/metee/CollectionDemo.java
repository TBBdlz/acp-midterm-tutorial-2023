package yingyongwatthanakit.metee;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {

	static final int ARRAY_MAX_SIZE = 1024;
	
	public static void main(String[] args) {
		// array - store multiple data within variable
		// python list = ['a', 0, 0.124] - Invalid in java
		int numberArray[];
		numberArray = new int[ARRAY_MAX_SIZE];
		
		// index              0, 1, 2, 3
		int luckyNumbers[] = {2, 3, 4, 8};

		luckyNumbers[1] = 88;
		System.out.println(luckyNumbers[1]);
		System.out.println("-------------------");

		// stright forward
		// for (int i = 0; i < luckyNumbers.length; i++) {
		// 	System.out.println("index " + i + ": " + luckyNumbers[i]);
		// }

		// for each
		// for (int number : luckyNumbers) {
		// 	System.out.println(number);
		// }

		// ArrayList - Java Data Structure (Collection API)
		// DynamicArray / DynamicList
		// ArrayList<Integer> dynamicList = new ArrayList<>();
		// dynamicList.add(40);
		// dynamicList.add(-20);
		// dynamicList.add(30);
		// dynamicList.add(10);
		// dynamicList.add(-50);

		int someArray[] = {-5, 1000, -4, 20, 0, 1, 4, 3, -100};
		Arrays.sort(someArray);
		for (int number : someArray) {
			System.out.println(number);
		}
	}
}
