package Tasks;

import java.util.Scanner;

public class JavaTask3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		while (true) {
			System.out.println("Enter a, b: ");
			try {
				a = Double.parseDouble(sc.nextLine());
				b = Double.parseDouble(sc.nextLine());
				if (a > 0 && b > 0) {
					getSquare(a, b);
					getPerimeter(a, b);
				} 
				else {
					System.out.println("Incorrect number!\n");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!");
				continue;
			}
		}
		sc.close();
	}

	public static void getSquare(double a, double b) {
		double Square = a * b / 2.0;
		System.out.printf("Square = %.3f\n", Square);
	}

	public static void getPerimeter(double a, double b) {
		double Perimeter = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.printf("Perimeter = %.3f", Perimeter);
	}
}
