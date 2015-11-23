package Tasks;

import java.io.IOException;
import java.util.Scanner;

public class JavaTask1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.println("Enter number: ");
			try {
				number = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}
		if (isNumber(number)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		sc.close();
	}

	public static boolean isNumber(int number) {
		int a = number % 100 + number / 10 % 10;
		int b = number / 1000 % 10 + number / 100 % 100;
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

}
