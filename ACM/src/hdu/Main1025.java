package hdu;

import java.util.Arrays;
import java.util.Scanner;

public class Main1025 {

	public static void main(String[] args) {

		Scanner kai = new Scanner(System.in);
		int t=1;
		while (kai.hasNext()) {
			int n = kai.nextInt();
			int p[] = new int[n];
			int r[] = new int[n];
			for (int i = 0; i < r.length; i++) {
				p[i] = kai.nextInt();
				r[i] = kai.nextInt();
			}
			for (int i = 0; i < r.length; i++) {
				for (int j = i + 1; j < r.length; j++) {
					if (p[i] > p[j]) {
						int temp = p[i];
						p[i] = p[j];
						p[j] = temp;
						temp = r[i];
						r[i] = r[j];
						r[j] = temp;
					}
				}
			}
//			System.out.println(Arrays.toString(p));
//			System.out.println(Arrays.toString(r));
			int dp[] = new int[n];
			dp[0] = 1;
			int max=1;
			for (int i = 1; i < dp.length; i++) {
				int value = 1;
				for (int j = i - 1; j >= 0; j--) {
					if (r[i] > r[j] && value < dp[j] + 1) {
						value = dp[j] + 1;
					}
				}
				dp[i] = value;
				if(value>max) {
					max=value;
				}
			}
			//System.out.println(Arrays.toString(dp));
			System.out.println("Case "+t+":");
			System.out.println("My king, at most "+max+" road can be built.");
			t++;
		}
	}
}
