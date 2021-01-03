package boj_2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = n;
		
		for(int i = 0; i<n;i++) {
			System.out.println(c);
			c--;
		}
	}
}
