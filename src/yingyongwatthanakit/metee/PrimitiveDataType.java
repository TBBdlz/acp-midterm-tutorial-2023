package yingyongwatthanakit.metee;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// byte (1 byte), short (2 bytes), int (4 bytes)
		long studentId = 6330401742L; // ends with l or L

		float pi = 3.14F; // ends with f or F
		double precise_pi = 3.141592653;

		double pi_replica = (double) pi;
		float precise_pi_replica = (float) precise_pi; // error
		System.out.println(studentId);

		char grade = 'A';
		boolean status = false;

		String name = "Turbo";
	}
	
}
