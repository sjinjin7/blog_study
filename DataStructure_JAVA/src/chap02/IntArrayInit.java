package chap02;
// 구성 자료형이 int형인 배열(구성 요솟수는 5 : 배열 초기자에 의해 생성)
// 실습 2-2
// 47p
//복습 ■ □ □ □ □ □ □ □ □ □ (8/16)

// 배열 선언과 동시에 초기화 진행
// 기존 방법 경우 
// int[] a;  a = new int[5];
// 혹은
// int[] a = new int[5]; 
// 선언하여 요소 하나하나 를 초기화
// ex) a[3] = 3; 배열 a 4번째 요소를 3으로 초기화

// 하지만 배열 선언과 동시에 초기화 가능

public class IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]= " + a[i]);
		

	}

}
