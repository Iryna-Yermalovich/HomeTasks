package Tasks;

import java.util.Scanner;

public class JavaTask5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] mas = new double[3];
		while (true) {
			try {
				System.out.println("Enter three numbers: ");
				for (int i = 0; i < mas.length; i++) {
					mas[i] = Double.parseDouble(sc.nextLine());
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}
		printMas(mas);
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				mas[i] = Math.pow(mas[i], 2);
			} else {
				mas[i] = Math.pow(mas[i], 4);
			}
		}
		printMas(mas);
		sc.close();
	}
	
	public static void printMas(double[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%.3f\t", mas[i]);
		}
		System.out.println();
	}
}
