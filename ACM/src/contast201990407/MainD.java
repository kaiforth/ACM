package contast201990407;


import java.util.Scanner;

public class MainD {

	public static void main(String[] args) {

		Scanner kai = new Scanner(System.in);
		int t = kai.nextInt();
		for (int pp = 0; pp < t; pp++) {
			int n = kai.nextInt();
			int arr[] = new int[n];
			int k = 1;
			for (int i = 0; i < arr.length; i += 2) {
				arr[i] = k;
				k++;
			}
			for (int i = 1; i < arr.length; i += 2) {
				arr[i] = k;
				k++;
			}
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[arr.length - 1]);

		}
	}
}
