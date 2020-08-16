package chap02;

import java.util.Random;
import java.util.Scanner;

// 배열 요소의 최댓값을 나타냅니다(값을 난수로 생성)
// 실습 2-5
// 54~57p
//복습 ■ □ □ □ □ □ □ □ □ □ (8/16)

/*
1. Random 난수 생성 사용되는 과정
	1) import java.util.Random;
		- Random클래스를 간단한 이름으로 사용하기 위해 형 import 선언
	2) Random rand = new Random();
		- Random 클래스형의 변수(rnad)를 만들기 위한 선언
	3) rnad.nextInt(90);
		- 변수 rnad에 대한 난수를 생성하는 메서드 nextInt를 호출

2. 난수의 생성
	- java.util 패키지에 속한 Random 클래스는 Java가 제공하는 아주 큰 클래스 라이브러리.
	- Random 클래스의 인스턴스는 일련의 의사 난수를 생성.
	- 난수는 존재하지 않은것이 값자기 생성되는 것이 아니라 'seed(씨앗)'이라는 수의 값을 바탕으로 여러 연산을 수행하여 얻어짐.
	- Random 클래스에서는 48비트의 seed를 사용하고, 이 seed는 선형 합동법이라는 계산법에 의해 특정 수(난수)로 바뀜.
	* Random rand = new Random();
	  => 난수 생성기를 새로 만듬. 해당 경우 Random 클래스의 다른 인스턴스와 겹치지 않도록 'seed'의 값을 자동으로 결정.
	* Random rand = new Random(n);
	  => seed를 직접 지정하는 방법. 주어진 seed를 바탕으로 난수 생성기가 난수를 생성
3. 생성되는 난수는 진짜 나수가 아님
 	- 난수를 생성하는 메서드(srand 메서드)에서 사용되는 seed값이 같다면 그 결과값은 항상 같음
 	- 따라서 컴퓨터에 의해 생성된 모든 난수는 미리 컴퓨터가 계산해 둔 의사 난수.(난수표를 저장해 두엇다가 seed값에 따라 꺼내서 쓴다고 바도 무방)
 	- 이러한 이유로 중요한 것이 seed값이 매번 달라야 함. => 현재 시간을 이용하여 seed값을 매번 다르게 사용되도록 프로그래밍 됨
 	
4. Rnadom 클래스 메서드
	메서드 호출			자료형		생성하는 값의 범위
	nextBoolean()		boolean		true 또는 false
	nextInt() 			int			-2147483648 ~ +2147483647
	nextInt(n)			int			0~n-1
	nextLong()			long		-9223372036854775808 ~ +9223372036854775807
	nextDouble() 		double		0.0이상 1.0 미만
	nextFloat()			float		0.0이상 1.0 미만
	
5. 의사난수 
	- 난수는 아니나 난수로 취급이 가능한 수열을 지칭한다. 보통 난수를 만들 수 없는 컴퓨터 등에서 난수를 사용하기 위해서 만들어진 수열.
	- 충분한 숫자를 가지고 적당한 분포를 가진 수열 또는 수열을 생성 가능한 식을 통해 만들어지면 의사난수로 사용 가능하다.
	


*/

public class MaxOfArrayRand {
	// 배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < num ; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
	}
	
	
}
