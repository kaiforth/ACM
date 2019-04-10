package contast201990407;

import java.math.BigInteger;
import java.util.Scanner;

public class MainH {

	public static void main(String[] args) {
		Scanner kai = new Scanner(System.in);
		while (kai.hasNext()) {
			String s1 =kai.next();
			String s2 = kai.next();
			BigInteger a = new BigInteger(new BigInteger(zhuanghuan(s1), 26).toString(10));
			BigInteger b = new BigInteger(new BigInteger(zhuanghuan(s2), 26).toString(10));
//			System.out.println(a);
//			System.out.println(b);
			System.out.println(fanzhuanghuan(a.add(b).toString(26).toUpperCase()));
		}
	}

	public static String zhuanghuan(String s) {
		String s1 = "";
		char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] c2 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O','P' };
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 0; j < c.length; j++) {
				if (a == c[j]) {
					s1 += c2[j];
					break;
				}
			}
		}
		return s1;
	}
	public static String fanzhuanghuan(String s) {
		String s1 = "";
		char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] c2 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O' ,'P'};
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 0; j < c2.length; j++) {
				if (a == c2[j]) {
					s1 += c[j];
					break;
				}
			}
		}
		return s1;
	}
}
