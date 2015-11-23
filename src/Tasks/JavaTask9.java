package Tasks;

import java.util.Scanner;

public class JavaTask9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3, m = 2;
		double[] a = new double[10];
		double[] b = new double[10];
		int k;
		while (true) {
			try {
				System.out.println("Enter three numbers: ");
				for (int i = 0; i < n; i++) {
					if (sc.hasNextDouble()) {
						a[i] = Double.parseDouble(sc.nextLine());
					}
				}
				System.out.println("Enter two numbers: ");
				for (int i = 0; i < m; i++) {
					if (sc.hasNextDouble()) {
						b[i] = Double.parseDouble(sc.nextLine());
					}
				}
				System.out.println("Enter k: ");
				k = Integer.parseInt(sc.nextLine());
				if (k > n) {
					System.err.println("Incorrect k!");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}
		for (int i = k; i < n + k; i++) {
			a[i + m] = a[i];
		}
		for (int i = 0; i < m; i++) {
			a[i + k] = b[i];
		}

		for (int i = 0; i < m + n; i++) {
			System.out.println(a[i]);
		}
		
		sc.close();
	}
}
