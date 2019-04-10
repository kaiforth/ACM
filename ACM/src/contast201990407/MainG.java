package contast201990407;

import java.util.Scanner;
import java.util.Stack;

public class MainG {

	public static void main(String[] args) {

		Scanner kai = new Scanner(System.in);
		int t = kai.nextInt();
		for (int pp = 0; pp < t; pp++) {

			Stack<Integer> stack = new Stack<Integer>();
			int money = kai.nextInt();
			stack.push(150);
			while (stack.peek() <= money) {
				if (stack.size() == 1) {
					stack.push(200);
				} else if (stack.peek() == 200) {
					stack.push(300);
				} else {
					stack.push(stack.peek() + 50);
				}
			}
			stack.pop();
			if (stack.isEmpty()) {
				System.out.println(money);
			} else {
				System.out.println(money - stack.peek());
			}

		}

	}

}
