package arraylist;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		//ArrayList(int initialCapacity) : 지정된 초기용량을 갖는 ArrayList를 생성
		//크기가 10인 ArrayList를 인스턴스화 후 ArrayList 타입의 참조변수 list1에 저장
		ArrayList list1 = new ArrayList(10);
		//boolean add(Object o) : ArrayList의 마지막에 객체를 추가, 성공하면 true
		// 5, 4, 3, 2, 0, 1, 3순으로 list1에 객체를 추가
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//List subList(int fromIndex, int toIndex) : fromIndex부터 toIndex사이에 저장된 객체를 반환한다.
		//ArrayList(Collection c) : 주어진 컬렉션이 저장된 ArrayList를 생성
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
	
}
