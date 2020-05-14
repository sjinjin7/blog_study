package arraylist;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		//ArrayList(int initialCapacity) : ������ �ʱ�뷮�� ���� ArrayList�� ����
		//ũ�Ⱑ 10�� ArrayList�� �ν��Ͻ�ȭ �� ArrayList Ÿ���� �������� list1�� ����
		ArrayList list1 = new ArrayList(10);
		//boolean add(Object o) : ArrayList�� �������� ��ü�� �߰�, �����ϸ� true
		// 5, 4, 3, 2, 0, 1, 3������ list1�� ��ü�� �߰�
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//List subList(int fromIndex, int toIndex) : fromIndex���� toIndex���̿� ����� ��ü�� ��ȯ�Ѵ�.
		//ArrayList(Collection c) : �־��� �÷����� ����� ArrayList�� ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
	
}
