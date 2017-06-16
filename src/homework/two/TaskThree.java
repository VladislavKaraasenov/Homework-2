package homework.two;

import java.util.Scanner;

public class TaskThree {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Please enter second number: ");
		int secondNumber = sc.nextInt();
		if (firstNumber <= secondNumber) {
			for (; firstNumber <= secondNumber; firstNumber++) {
				System.out.println(firstNumber);
			}
		} else {
			for (; secondNumber <= firstNumber; secondNumber++) {
				System.out.println(secondNumber);
			}
		}

		// if (firstNumber <= secondNumber) {
		// while (firstNumber <= secondNumber) {
		// System.out.println(firstNumber);
		// firstNumber++;
		// }
		// } else {
		// while (secondNumber <= firstNumber) {
		// System.out.println(secondNumber);
		// secondNumber++;
		// }
		// }

		// if (firstNumber < secondNumber) {
		// do {
		// System.out.println(firstNumber);
		// firstNumber++;
		// } while (firstNumber <= secondNumber);
		// } else {
		// do {
		// System.out.println(secondNumber);
		// secondNumber++;
		// } while (secondNumber <= firstNumber);
		// }

		sc.close();
	}
}
