package boj_1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if((0 < a) && (a >= 10)) {
			System.out.println("a에 0이상 10미만의 수를 입력해주세요");
			return;
		}
		
		if((0<b)&&(b >= 10)) {
			System.out.println("b에 0이상 10미만의 수를 입력해 주세요");
			return;
		}
			System.out.println(a/b);
	}

}
