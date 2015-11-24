package Tasks;

import java.util.Scanner;

public class JavaTask8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		int[] mas = new int[3];
		while (true) {
			try {
				System.out.println("Enter three numbers: ");
				for (int i = 0; i < mas.length; i++) {
					if (sc.hasNextDouble()) {
						mas[i] = Integer.parseInt(sc.nextLine());
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
		getSum(mas, k);
		sc.close();
	}

	public static void getSum(int[] mas, int k) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		System.out.println("Sum = " + sum);
	}

}
