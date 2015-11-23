package Tasks;

import java.util.Scanner;

public class JavaTask10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			try {
				System.out.println("Enter N: ");
				n = Integer.parseInt(sc.nextLine());
				if (n % 2 == 0) {
					double[][] mas = new double[n][n];
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < n; j++) {
							if (i % 2 == 0) {
								mas[i][j] = n - j;
							}
							else {
								mas[i][j] = j + 1;
							}
						}
					}
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < n; j++) {
							System.out.print(mas[i][j] + " ");
						}
						System.out.println();
					}
				} else {
					System.out.println("N is odd!\n");
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
}