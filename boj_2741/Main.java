package boj_2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j = 1;	
		if(n>0) {
			
		for(int i = 0; i<n;i++) {
			System.out.println(j);
			j++;
		}
			
		}else
			System.out.println("자연수를 입력하세요.");
	}
}
