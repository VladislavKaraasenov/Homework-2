package homework.two;

import java.util.Scanner;

public class TaskFive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter n: ");
		int n = sc.nextInt();

		for (int i = 3; i <= n; i += 3) {
			System.out.print(i + ", ");
		}

		// int i = 3;
		// while (i <= n) {
		// System.out.print(i + ", ");
		// i += 3;
		// }

		// int i = 3;
		// do {
		// System.out.print(i + ", ");
		// i += 3;
		// } while ( i <= n);

		sc.close();
	}
}
