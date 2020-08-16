package chap02_practice;

import java.util.Scanner;

public class Copy_02_04_me {

	// 배열 복사
	static void copy(int[] a, int[] b) {
		
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		
	}
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	// 두배열 a,b의 모든 요소 비교
	static boolean equals(int[]a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		int[] b = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		copy(b,a);
		
		System.out.print("a 배열은 : ");
		print(a);
		System.out.print("b 배열은 : ");
		print(b);
		
		System.out.println("배열 a와 b는 " + (equals(a,b) ? "같습니다" : "같지 않습니다."));
		
		
	}
}
