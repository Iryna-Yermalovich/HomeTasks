package Tasks;

import java.util.Scanner;

public class JavaTask9 {

	private static final int N = 5;
	private static final int M = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[N];
		int[] b = new int[M];
		int[] c = new int[N + M];
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

		sc.close();
	}

}
