package chap02;
// 배열 요소에 값을 읽어 들여 역순으로 정렬
// 실습 2-6
// 56~61p

/*
1. 개수가 n인 배열 요소를 역순으로 정렬하는 알고리즘 
						for(i=0; i< n/2; i++)
						//a[i]와 a[n-i-1]의 값을 교환
	
	- n개의 배열을 역순으로 정렬하기 위해선 n/2의 교환이 이루어 져야 함
		- 7개의 요소를 가진 배열(a[7])이 있다고 가정 아래의 교환이 이루어져야만 역순으로 정렬됨
		  a[0]과 a[6] 교환
		  a[1]과 a[5] 교환
		  a[2]과 a[4] 교환
	- 위의 3번의 과정에서 인덱스가 변환 하는 과정
	  	  앞의 인덱스는 0 => 1 => 2
	  	  뒤의 인덱스는 6 => 5 => 4
	  	  
	  => * 규칙화 
	  	   	i는 0 부터 1씩 증가  / n은 7 
	  	  	앞의 인덱스 : i 
			뒤의 인덱스 : n-i-1
	
2. 두 값의 교환
	목표 : x는 30 y는 60 이고 서로의 값을 교환하는 것이 목표입니다.
	
	- 두변수의 값을 교환하기 위해선 같은 자료형을 가진 변수 t를 하나 더 사용해야합니다.
	- 두값을 변환하기 위해선 다음과 같은 3단계가 필요합니다.
		 x = 30 / y = 60 / t = 0
		 1단계 : x 값을 t에 보관 [x->t]				(x = 30 / y = 60 / t = 30)
		 2단계 : y 값을 x에 대입 [y->x]				(x = 60 / y = 60 / t = 30)
		 3단계 : t에 보관한 처음 x값을 y에 대입[t->y]		(x = 60 / y = 30 / t = 30)
	



*/

import java.util.Scanner;

public class ReverseArray {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i -1);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();		// 요솟수
		
		int[] x = new int[num];			// 요솟수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);	// 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬햇습니다.");
		for(int i = 0; i < num; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		
	}
	
	
}
