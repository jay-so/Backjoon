package boj_9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if((a < 0) || (a > 100)) 
			System.out.println("a에 0이상 100이하의 수를 넣어주세요.");
		else if((a>=90)&&(a<=100))
			System.out.println("A");
		else if((a>=80)&&(a<90))
			System.out.println("B");
		else if((a>=70)&&(a<80))
			System.out.println("C");
		else if((a>=60)&&(a<70))
			System.out.println("D");
		else 
			System.out.println("F");
	}

}
