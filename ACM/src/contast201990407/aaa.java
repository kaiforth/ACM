package contast201990407;

import java.util.Arrays;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = new char[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (i + 65);	
		}
		System.out.println(Arrays.toString(arr));
	}

}
