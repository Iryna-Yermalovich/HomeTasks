package Tasks;

import java.io.IOException;
import java.util.Scanner;

public class JavaTask2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double a, b, c, result;
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

		double d = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		result = ((b + d) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, (-2)));
		if (Double.isInfinite(result)) {
			System.err.println("Division by zero!");
		} else {
			System.out.printf("Result: %.4f\n", result);
		}

		sc.close();
	}
}
