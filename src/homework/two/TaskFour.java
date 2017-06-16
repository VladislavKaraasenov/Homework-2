package homework.two;

import java.util.Scanner;

public class TaskFour {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = sc.nextInt();

		int sum = 0;
		for (int num = 0; num <= number; num++) {
			sum += num;
		}
		System.out.println("Result is: " + sum);

		// while (num < number) {
		// num++;
		// sum += num;
		// }
		// System.out.println("Result is: " + sum);

		// do {
		// num++;
		// sum += num;
		// } while (num < number);
		// System.out.println("Result is: " + sum);

		sc.close();
	}
}
