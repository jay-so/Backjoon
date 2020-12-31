package boj_10869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((0 < a) && (a>= 10001)) {
			System.out.println("a에 0이상 10,001미만의 수를 입력해주세요");
			return;
		}
		
		if((0<b)&&(b >= 10001)) {
			System.out.println("b에 0이상 10,001미만의 수를 입력해 주세요");
			return;
		}
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
