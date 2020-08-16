package chap02_practice;

import java.util.Scanner;

public class SumOf_02_03_me {

	// 요소의 합계
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		int sum = sumOf(x);
		
		System.out.println("모든 요소의 합계는 " + sum + "입니다.");
	}
	
	
}
