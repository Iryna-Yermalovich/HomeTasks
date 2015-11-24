package Tasks;

import java.util.Scanner;


public class JavaTask4 {
	
	private static final int MAX_X1 = 2;
	private static final int MIN_X1 = -2;
	private static final int MAX_Y1 = 4;
	private static final int MIN_Y1 = 0;
	
	private static final int MIN_X2 = -4;
	private static final int MAX_Y2 = 0;
	private static final int MIN_Y2 = -3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		while (true) {
			System.out.println("Enter x, y: ");
			try {
				x = Integer.parseInt(sc.nextLine());
				y = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Incorrect number!\n");
				continue;
			}
		}
		getAnswer(x, y);
		sc.close();
	}

	public static void getAnswer(int x, int y){
		if (((x >= -MIN_X1 && x <= MAX_X1) && (y >= MIN_Y1 && y <= MAX_Y1))) {
			System.out.println("True");
		}
		else if (((x >= MIN_X2 && x <= MAX_Y1) && (y >= MIN_Y2 && y <= MAX_Y2))) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
	}
}
