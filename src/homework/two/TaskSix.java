package homework.two;

//import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 15 numbers: ");

		int[] array = new int[15];
		for (int a = 0; a < array.length; a++) {
			array[a] = sc.nextInt();
		}
		int min = array[0];
		int max = array[0];
		for (int elem : array) {
			if (elem > max) {
				max = elem;
			}
			if (elem < min) {
				min = elem;
			}
		}
		System.out.println("Smallest number is: " + min);
		System.out.println("Biggest number is: " + max);

		// int[] array = new int[15];
		// for (int a = 0; a < array.length; a++) {
		// array[a] = sc.nextInt();
		// }
		// Arrays.sort(array);
		// System.out.println("Biggest number is: " + array[14]);
		// System.out.println("Smallest number is: " + array[0]);

		sc.close();
	}
}
