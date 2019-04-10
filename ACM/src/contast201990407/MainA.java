package contast201990407;

import java.util.Arrays;
import java.util.Scanner;
//«©µΩÃ‚A
public class MainA {

	public static void main(String[] args) {

		Scanner kai = new Scanner(System.in);
		while (kai.hasNext()) {

			String str = kai.next();
			String arr[] = str.split("5");
			int a[] = new int[arr.length];
			for (int i = 0; i < a.length; i++) {
				if (arr[i].equals("")) {
					a[i] = -1;
				} else {
					a[i] = Integer.parseInt(arr[i]);
				}
			}
			Arrays.sort(a);
			for (int i = 0; i < arr.length - 1; i++) {
				if(a[i]!=-1)
				System.out.print(a[i] + " ");
			}
			System.out.println(a[a.length - 1]);
			// System.out.println(Arrays.toString(arr));
		}
	}
}
