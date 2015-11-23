package Tasks;

import java.util.Scanner;

public class JavaTask9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] firstMas = new double[2];
		double[] secondMas = new double[3];
		int k;
		while (true) {
			try {
				System.out.println("Enter two numbers: ");
				for (int i = 0; i < firstMas.length; i++) {
					if (sc.hasNextDouble()) {
						firstMas[i] = Double.parseDouble(sc.nextLine());
					}
				}
				System.out.println("Enter three numbers: ");
				for (int i = 0; i < secondMas.length; i++) {
					if (sc.hasNextDouble()) {
						secondMas[i] = Double.parseDouble(sc.nextLine());
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
		for (int i = firstMas.length; i < (firstMas.length + secondMas.length); i++) {
			//firstMas[] = new double[firstMas.length + secondMas.length];
			firstMas[k + i] = firstMas[i];
		}
		for (int i = 0; i < firstMas.length ; i++) {
			System.out.println(firstMas.length + " " + firstMas[i]);
		}
		
		sc.close();

	}

}
