package chap02;
// 1,000이하의 소수를 열거(PrimeNumber2 개선)
// 75p
// 실습 2-10
//복습 ■ □ □ □ □ □ □ □ □ □ (8/31)

/*
	 PrimeNumber1에서의 과정을 살펴보면 2 또는 3으로 나누어떨어지지 않으면 2*2인 4 또는 2*3인 6으로도 나누어떨어지지 않음.
	따라서 불필요하게 많은 나눗셈을 진행.
	 앞서 소수는 2부터 n-1까지의 어떤 정수로도 나누어떨어지지 않는 수였지만, PrimeNumber1의 과정으로 부터 얻을 소수는 어떤 
	 소수로도 나누어 떨어지지 않는다는 성질을 이용하여 새롭게 정의
	 => 소수는 부터 n-1까지의 어떤 소수로도 나누어떨어지지 않는다.
	 
	 예를들어 7이 소수인지 확인하기 위해 7보다 작은 소수 2, 3, 5로 나눗셈을 하면 충분함
 */

public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;			// 나눗셈의 횟수
		int ptr = 0;				// 찾은 소수의 개수
		int[] prime = new int[500];	// 소수를 저장하는 배열
		
		prime[ptr++] = 2;			// 2는 소수
		
		for(int n = 3; n <= 1000; n += 2) {		// 4이상의 짝수는 2로 나누어떨이지기때문에 홀수로만 진행되도록 설계
			
			int i;
			for(i = 1; i < ptr; i++) {
				counter++;
				if(n%prime[i] == 0)
					break;
			}
			if(ptr == i)
				prime[ptr++] = n;
		}
		
		for(int i = 0; i < ptr; i++)
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
