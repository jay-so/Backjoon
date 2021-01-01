package boj_1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a<-10000)&&(a>10000)) {
			System.out.println("a에 -10,000 이상 10,000이하의 수를 넣어주세요");
		}
		if((b<-10000)&&(b>10000)) {
			System.out.println("b에 -10,000 이상 10,000이하의 수를 넣어주세요");
		}
		
		if(a>b) 
			System.out.println(">");
		else if(a <b)
			System.out.println("<");
		else
			System.out.println("==");
	}
}
