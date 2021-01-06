package boj_10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int x = sc.nextInt();
		
		for(int i = 0 ;i<=n-1;i++) {
			int a = sc.nextInt();
			 arr[i] = a;
			 
			 if(arr[i] < x) {
				 System.out.print(arr[i] + " ");
			 }
		}
	}

}
