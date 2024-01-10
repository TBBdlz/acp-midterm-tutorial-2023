package yingyongwatthanakit.metee;

public class Arithmetic {
	
	public static void main(String[] args) {
		// Number arithmetic : +, -, *, /, %
		int num1 = 10;
		int num2 = 20;

		float pi = 3.14F;
		System.out.println(num1 + num2 + pi);

		System.out.println("---------");

		// System.out.println(num1 / num2); -> 0
		System.out.println((float) num1 / num2);

		// mod
		int numApple = 100;
		int numFriend = 6;
		int leftOverApple = numApple % numFriend; // mod = เศษจากการหาร
		System.out.println("Apple remaining: " + leftOverApple);
	}

}
