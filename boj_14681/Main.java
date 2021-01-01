package boj_14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(((-1000>x)&&(x>1000))&& x != 0)
			System.out.println("x에 -1000이상 1000이하, 0이 아닌 정수를 입력하세요");
		if(((-1000>y)&&(y>1000))&& y != 0)
			System.out.println("y에 -1000이상 1000이하, 0이 아닌 정수를 입력하세요");
		
		if(x>0) {
			if(y>0)
				System.out.println("1");
			else
				System.out.println("4");
		}else {
			if(y>0)
				System.out.println("2");
			else
				System.out.println("3");
		}
	}
}
