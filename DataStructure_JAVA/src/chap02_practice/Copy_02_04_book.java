package chap02_practice;

import java.util.Scanner;

// 배열 b의 모든 요소를 배열 a에 복사함

public class Copy_02_04_book {

	// 배열 b의 모든 요소를 배열 a에 복사
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++)
			a[i] = b[i];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a 의 요솟수는 : ");
		int numa = stdIn.nextInt();
		int[] a = new int[numa];
		for(int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b의 요솟수는 : ");
		int numb = stdIn.nextInt();
		int[] b = new int[numb];
		for(int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		copy(a,b); // 배열 b의 모든 요소를 배열 a에 역순으로 복사
		
		System.out.println("배열 b의 요소를 배열 a에 복사했습니다.");
		for(int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
