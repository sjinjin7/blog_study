package chap02;
// 배열을 복제
// 실습 2-3
// 48p


public class CloneArray {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		// a에서 참조하는 배열을 복제 하여  복재한 배열을 변수 b 가 참조합니다.
		// 변수 b가 참조하는 배열은 a가 참조하는 배열과 동일 하지않습니다.
		// 배열을 복제한다는 말은 메모리에 새로운 공간을 할당하여 그곳에 동일한 배열을 복제 한다는 의미입니다.
		
		b[3] = 0;
		
		System.out.print("a = ");
		for(int i = 0; i < a.length ; i++) {
			System.out.print(" " + a[i]);
		}
		
		System.out.print("\nb = ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}
