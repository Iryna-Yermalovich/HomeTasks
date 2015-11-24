package Tasks;

import java.util.Scanner;

public class JavaTask9 {

	private static final int N = 5;
	private static final int M = 6;
	private static int[] a = new int[N];
	private static int[] b = new int[M];
	private static int[] c = new int[N + M];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		for (int i = 0; i < N; i++) {
			a[i] = (int) (Math.random() * 12);
		}
		for (int i = 0; i < M; i++) {
			b[i] = (int) (Math.random() * 12);
		}
		System.out.println("Enter k: ");
		k = Integer.parseInt(sc.nextLine());
		if (k > N) {
			System.err.println("Incorrect k!");
		}
		getNewMas(k);
		printMas();
		sc.close();
	}

	public static void getNewMas(int k) {
		for (int i = 0; i < c.length; i++) {
			if (i < k) {
				c[i] = a[i];
			}
			if (i == k) {
				for (int j = 0; j < b.length; j++) {
					c[j + i] = b[j];
				}
			}
			for (int j = k; j < a.length; j++) {
				c[j + b.length] = a[j];
			}
		}
	}

	public static void printMas() {
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < M; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < M + N; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
