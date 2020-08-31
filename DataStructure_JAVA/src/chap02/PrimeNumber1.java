package chap02;
// 1,000 이하의 소수를 열거
// 72p
// 실습 2-9
// //복습 ■ □ □ □ □ □ □ □ □ □ (8/31)

/*
	소수 : 자신과 1이외의 정수로 나누어떨이지지 않는 정수
	반대개념 => 합성수(자신과 1이외의 정수로도 나누어지는 수)
*/
/*
	아래의 결과를 통해 알 수 있는 것은 
	1. n이 소수인 경우 : n과 같은 값
	2. n이 합성수인 경우 : n보다 작은 값

*/
public class PrimeNumber1 {

	public static void main(String[] args) {

		int counter = 0;	// 나눗셈이 실행되는 횟수
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {	// 마지막까지 나머지가 0이 아닐 경우 i와 n이 동일해짐
				counter++;
				if(n % i == 0)	// 나머지가 0이라는 것은 나누어 떨어진다는 으미
					break;		// for문을 벗어나게 됨
			}
			if(n == i)			// for문을 반복아여 마지막까지 나머지가 0이 아닐 경우
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);

	}
	
}
