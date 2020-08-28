package chap02;
// 두배열이 같은거를 판단
// 63p
//실습 2-7
//복습 ■ ■ □ □ □ □ □ □ □ □ (8/16)(8/28)

import java.util.Scanner;

public class ArrayEqual {
	// 두 배열 a,b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		// 길이가 같지 않으면 false 반환
		if(a.length != b.length) {
			return false;
		}
		
		// 요소 하나하나를 비교 같지 않으면 false 반호나
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		// 모든 것이 같을 때 true 반환
		return true;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a,b)?"같습니다." : "같지 않습니다."));
		
	}
	
	
}
