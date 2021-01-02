package boj_2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H == 0) {
			if(M>=45) {
				System.out.print(H+ " ");
				System.out.print((M-45));
				return;
			}		
			else {
				H=23;
				System.out.print(H+" ");
				System.out.print(60-(45-M));
				return;
			}
		}
		
		if(H!=0) {
			if(M>=45) {
				System.out.print(H+" ");
				System.out.print((M-45));
				return;
			}
			else {
				H--;
				System.out.print(H+" ");
				System.out.print(60-(45-M));
				return;
			}
		}
	}
}
