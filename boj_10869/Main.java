package boj_10869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((0 < a) && (a>= 10001)) {
			System.out.println("a�� 0�̻� 10,001�̸��� ���� �Է����ּ���");
			return;
		}
		
		if((0<b)&&(b >= 10001)) {
			System.out.println("b�� 0�̻� 10,001�̸��� ���� �Է��� �ּ���");
			return;
		}
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
