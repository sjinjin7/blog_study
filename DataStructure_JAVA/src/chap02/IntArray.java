package chap02;
// 구성 요소의 자료형이 int형인 배열(구성 요솟수는 5 : new에 의해 본체를 생성)
//44p
//실습 2-1
// 복습 ■ ■ □ □ □ □ □ □ □ □ (8/16)(8/17)


/*
1. 자료구조란? 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법이다.
2. 배열이란? 같은 자료형의 변수로 이루어진 구성 요소(component)가 모인 것
3. 배열 선언방법
	1) 배열 변수 선언
	
		int[] a
		int a[]
	
	2) 선언한 변수 참조
	
		a = new int[5]
		
			ex)
				int[] a;
				a = new int[5];
				
				int[] a = new int[5]
4. 배열의 요소 접근 방법 : []을 사용한다

	배열 변수 이름[인덱스]
		ex)
			a[0] =5;  배열 첫번째 요소를 5로 초기화
		
5. 요소길이 : 배열 변수 이름.length

6. 배열의 구성요소는 자동으로 0으로 초기화 되는 규칙이 있다.

	6.1 지역변수는 자동으로 초기화 되지 안흔다. 
*/


public class IntArray {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		
	}
	
}
