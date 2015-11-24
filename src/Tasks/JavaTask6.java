package Tasks;

import java.util.Scanner;

public class JavaTask6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		while (true) {
			System.out.println("Enter a, b, c: ");
			try {
				a = Double.parseDouble(sc.nextLine());
				b = Double.parseDouble(sc.nextLine());
				c = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}
		getSum(a, b, c);
		sc.close();
	}

	public static void getSum(double a, double b, double c) {
		double min, max;
		// Easy way
		min = Math.min(a, Math.min(b, c));
		max = Math.max(a, Math.max(b, c));
		System.out.println("Sum = " + (min + max));
		///////////////////////////////////////////
		
		if (a < b && a < c) {
			min = a;
		} else if (c < a && c < b) {
			min = c;
		} else {
			min = b;
		}
		if (a > b && a > c) {
			max = a;
		} else if (c > a && c > b) {
			max = c;
		} else {
			max = b;
		}
		System.out.println("Sum = " + (min + max));
	}
}