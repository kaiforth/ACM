package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GrKai {
	static char map[][];
	static int step[][];
	static int aimX;
	static int aimY;
	static Queue<Node> q = new LinkedList<Node>();
	static int x;
	static int y;

	public static void main(String[] args) {
		Scanner kai = new Scanner(System.in);
		x = kai.nextInt();
		y = kai.nextInt();
		kai.nextLine();

		map = new char[x][y];
		step = new int[x][y];
		int nx = 0;
		int ny = 0;
		for (int i = 0; i < x; i++) {
			String nextLine = kai.nextLine();
			char[] c = nextLine.toCharArray();
			for (int j = 0; j < y; j++) {
				map[i][j] = c[j];
				if (c[j] == 'G') {
					nx = i;
					ny = j;
				}
				if (c[j] == 'S') {
					aimX = i;
					aimY = j;
				}
			}
		}

		sou(new Node(nx, ny));
		print(step);
	}

	private static void sou(Node e) {
	
		map[e.x][e.y] = '#';
		if (e.x > 0 && map[e.x - 1][e.y] == '.') {
			q.add(new Node(e.x - 1, e.y));
			step[e.x - 1][e.y] = step[e.x][e.y] + 1;
		}
		if (e.x < x - 1 && map[e.x + 1][e.y] == '.') {
			q.add(new Node(e.x + 1, e.y));
			step[e.x + 1][e.y] = step[e.x][e.y] + 1;
		}
		if (e.y > 0 && map[e.x][e.y - 1] == '.') {
			q.add(new Node(e.x, e.y - 1));
			step[e.x][e.y - 1] = step[e.x][e.y] + 1;
		}
		if (e.y < y - 1 && map[e.x][e.y + 1] == '.') {
			q.add(new Node(e.x, e.y + 1));
			step[e.x][e.y + 1] = step[e.x][e.y] + 1;
		}
		if (q.isEmpty()||e.x == aimX && e.y == aimY) {
			return;
		} else {
			sou(q.poll());
		}
	}

	public static void print(int[][] arr) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
