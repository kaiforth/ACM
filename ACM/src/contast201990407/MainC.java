package contast201990407;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		Scanner kai = new Scanner(System.in);
		int t = kai.nextInt();
		for (int i = 0; i < t; i++) {
			int a = kai.nextInt();
			int b = kai.nextInt();
			String str = kai.next();
			String u = str.substring(4, str.length());
			Double k = Double.valueOf(u);
			double munite = (k - 8) * 60;
			b += munite;
			String sx = "";
			String sy = "";
			int bb = (int) (b / 60);
			b = b % 60;
			if (b < 0) {
				a = a - 1;
				b = 60 + b;
			}
			int x = (a + bb) % 24;
			int y = b;
			if (x < 10) {
				sx = "0" + x;
			} else {
				sx = "" + x;
			}
			if (y < 10) {
				sy = "0" + y;
			} else {
				sy = "" + y;
			}

			System.out.println(sx + ":" + sy);
		}
	}
}
