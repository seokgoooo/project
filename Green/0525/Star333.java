import java.util.Scanner;
public class Star333 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {    // i = 0 j = 4,3,2,1

			for (int j = 4; j > i; j--) {// i = 1 j = 3,2,1

                                     // i = 2 j = 2,1

                                     // i = 3 j = 1

                                     // i = 4 j = i보다 커야하는데 j는 4이므로 해당 없음

				System.out.print(" ");

			}

			for (int k = 0; k <= i; k++) {          // i = 0 k =         0

                                                // i = 1 k =       0,1

                                                // i = 2 k =     0,1,2

                                                // i = 3 k =   0,1,2,3

                                                // i = 4 k = 0,1,2,3,4

				System.out.print("*");

			}

        System.out.println();

		}
	}
}