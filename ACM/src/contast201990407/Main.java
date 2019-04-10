package contast201990407;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner kai = new Scanner(System.in);
		int t = kai.nextInt();
		for (int pp = 0; pp < t; pp++) {
			int n = kai.nextInt();
			int arr[] = new int[101];
			int max = 0;
			int time = 0;
			for (int i = 0; i < n; i++) {
				int a = kai.nextInt();
				if (arr[a] == 0) {
					time += 6;
					arr[a] = 1;
				} else {
					time += 1;
				}
				if (a > max) {
					max = a;
				}
			}
			time += (max * 10);
			System.out.println(time);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
