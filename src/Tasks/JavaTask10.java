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
				int[][] mas = new int[n][n];
				if (n % 2 == 0) {
					setMas(mas, n);
					printMas(mas, n);
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

	public static void setMas(int[][] mas, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} else {
					mas[i][j] = n - j;
				}
			}
		}
	}

	public static void printMas(int[][] mas, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
