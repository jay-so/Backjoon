package boj_10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] add = new int[T];
		
		for(int i = 0; i<T;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			add[i] = a+b;
		}
		
		for(int n:add) {
			System.out.println(n);
		}
	}
}
