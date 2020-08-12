package chap02;

import java.util.Scanner;

//배열 요소의 최댓값을 나타냅니다(값을 입력 받음).

/*
1.도출되는과정
	- 2개의 값 최댓값
		max = a[0];
		if(a[1] > max) max = a[1];
		if(a[2] > max) max = a[2];
		
	- 3개의 값 최댓값
		max = a[0];
		if(a[1] > max) max = a[1];
		if(a[2] > max) max = a[2];
		if(a[3] > max) max = a[3];
	
	- 4개의 값 최댓값
		max = a[0];
		if(a[1] > max) max = a[1];
		if(a[2] > max) max = a[2];
		if(a[3] > max) max = a[3];
		if(a[4] > max) max = a[4];
	=> 요소 개수가 n개이면 if문이 n-1번 필요
	=> max에 대입하는 배열 a의 인덱스 1씩 증가
	
	max = a[0];
	for(i = 1; i < n-1; i++)
		if(a[i]>max)max=a[i];
		
2. 주사(走査)(traverse)란?
	- 위의 for문을 통해 배열 요소를 하나씩 검증 하는겉 과같이 차례로 살펴보는 과정을 말함
	- 데이터를 하나씩 지나면서 살피고, 조사하는 일
	- 본래 뜻 : 텔레비전 화면이나 사진을 전송할 때  화면을 여러 개의 점으로 나눠 그 점을 전기 신호로 바꾸는 일 또는 이 전기 신호에서 점을
			 조립하여 화면을 재구성 하는 것
			
			
*/



public class MaxOfArray {
	// 배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("height[" + i + "]:");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
	
	
}
