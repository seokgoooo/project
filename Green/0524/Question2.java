public class Question2 {
	public static void main(String[] args) {
		String F = "Fizz";
		String B = "Buzz";
		String FB = "Fizz Buzz";
		for (int i = 1; i <= 35; i++) {
			if (i % 15 == 0) {
				System.out.print(FB + " ");
			} else if (i % 3 == 0) {
				System.out.print(F + " ");
			} else if (i % 5 == 0) {
				System.out.print(B + " ");
			} else {
				System.out.print(i + " ");
			}		
		}
	}
}