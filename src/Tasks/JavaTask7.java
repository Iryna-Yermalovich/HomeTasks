package Tasks;

import java.util.Scanner;

public class JavaTask7 {

	private static final double H = 0.25;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		while (true) {
			System.out.println("Enter a, b: ");
			try {
				a = Double.parseDouble(sc.nextLine());
				b = Double.parseDouble(sc.nextLine());
				if (a < b) {
					getFunction(a, b);
				} else {
					System.err.printf("Invalid range of values!\n");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}
		sc.close();
	}

	public static void getFunction(double a, double b) {
		double x, F;
		x = a;
		System.out.println("x\t F");
		while (x <= b) {
			F = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
			System.out.printf("%.2f\t%.4f\n", x, F);
			x += H;
		}
	}

}
