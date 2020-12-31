package boj_2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a*(b%10);
		System.out.println(c);
		
		int d = a*((b/10)%10);
		System.out.println(d);
		
		int e = a*(b/100);
		System.out.println(e);
		
		System.out.println(c + d * 10 + e *100);
	}
}
