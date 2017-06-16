package homework.two;

import java.util.Random;
import java.util.Scanner;

public class TaskSeven {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a number from 1 to 20: ");
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(20) + 1;
		int theNumberOfThePlayer;
		int tries = 0;

		do {
			theNumberOfThePlayer = sc.nextInt();
			if (number == theNumberOfThePlayer) {
				System.out.println("You Win");
				break;
			} else if (theNumberOfThePlayer < number && tries < 2) {
				System.out.print("Generated number is bigger! Please try again: ");
			} else if (theNumberOfThePlayer > number && tries < 2) {
				System.out.print("Generated number is smaller! Please try again: ");
			}
		} while (tries++ < 2);
		if (theNumberOfThePlayer != number) {
			System.out.println("The number is: " + number);
			System.out.println("Game over");
		}
		sc.close();
	}
}
