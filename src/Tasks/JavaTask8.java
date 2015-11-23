package Tasks;

import java.util.Scanner;

public class JavaTask8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] mas = new double[3];
		int k;
		double sum = 0.0;
		while (true) {
			try {
				System.out.println("Enter three numbers: ");
				for (int i = 0; i < mas.length; i++) {
					if (sc.hasNextDouble()) {
						mas[i] = Double.parseDouble(sc.nextLine());
					}
				}
				System.out.println("Enter k: ");
				k = Integer.parseInt(sc.nextLine());

				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		System.out.println("Sum = " + sum);

		sc.close();
	}

}
