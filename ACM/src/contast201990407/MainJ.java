package contast201990407;

import java.util.Scanner;

public class MainJ {

	public static void main(String[] args) {

		Scanner kai = new Scanner(System.in);
		int t = kai.nextInt();
		for (int i = 0; i < t; i++) {
			int n = kai.nextInt();
			int m = kai.nextInt();
			if (n % (m + 1) == 0) {
				System.out.println("second");
			} else {
				System.out.println("first");
			}
		}

	}

}
