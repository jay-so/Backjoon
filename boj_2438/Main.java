package boj_2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n>=1)&&(n<=100)) {
			for(int i = 0; i<n;i++) {
				for(int j = 0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else
			System.out.println("1�̻� 100������ ���� �Է��ϼ���.");
	}
}