package boj_10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((1 >= a) && (a >= 1001)) {
			System.out.println("a에 2이상,1000이하의 수를 입력히세요");
		}
		
		if((1 >= b) && (b >= 1001)) {
			System.out.println("b에 2이상,1000이하의 수를 입력히세요");
		}
		
		if((1 >= c) && (c >= 1001)) {
			System.out.println("c에 2이상,1000이하의 수를 입력해주세요");
		}
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
