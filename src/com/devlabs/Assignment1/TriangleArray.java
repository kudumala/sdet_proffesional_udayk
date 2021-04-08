package com.devlabs.Assignment1;

public class TriangleArray {

	public static void main(String[] args) {
		int[][] tri = new int[5][];
		int x = 1;
		for (int i = 0; i < 5; i++) {
			tri[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				tri[i][j] = x;
				System.out.print(0 + " ");
				x++;
			}
			System.out.println();
		}
	}

}
