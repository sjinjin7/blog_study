package list.arraylist.implementation;

import list.arraylist.implementation.ArrayList.ListIterator;

public class Main {

	/* ������ ArrayListŬ���� ����غ��� */
	/*�Ѱ��� : ��Ұ� �þ�� �ش� �迭�� ũ�Ⱑ �þ ���� �������� ����*/
	public static void main(String[] args) {
		
		/* ArrayList�� ��üȭ ���� ArrrayList numbers ���������� ���� */
		ArrayList numbers = new ArrayList();
		
		// 10, 20, 30, 40 ���ʷ� ������ ����ֱ�
		//addLast(Object element)
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		System.out.println("* 10,20,30,40 ������ ����ֱ�");
		System.out.println(numbers);
		System.out.println();

		
		// index1�� 15�ֱ�
		// add(int index, Object element)
		System.out.println("* index1�� 15�� �ֱ�");
		System.out.println("���� numbers ��ü : " + numbers);
		numbers.add(1, 15);
		System.out.println("�߰� ���� numbers ��ü : " + numbers);
		System.out.println();
		
		// ���� ù ��ҿ� 1 �� �ֱ�
		// addFirst(Object element)
		System.out.println("* ù ���(index0)�� 15�� �ֱ�");
		System.out.println("���� numbers ��ü : " + numbers);
		numbers.addFirst(1);
		System.out.println("�߰� �� number ��ü : " + numbers);
		System.out.println();
		
		
		// index 3�� ������ ����
		// remove(int index)
		System.out.println("* index 3�� ������ ����");
		System.out.println("���� numbers ��ü : " + numbers);
		numbers.remove(3);
		System.out.println("���� �� number ��ü : " + numbers);
		System.out.println();
		
		
		// �� ���� ���(index 0) ������ ����
		// removeFirst()
		System.out.println("* �� ���� ���(index 0) ������ ����");
		System.out.println("���� numbers ��ü : " + numbers);
		numbers.removeFirst();
		System.out.println("���� �� number ��ü : " + numbers);
		System.out.println();
		
		
		// ������ ��� ������ ����
		// removeLast()
		System.out.println("* ������ ��� ������ ����");
		System.out.println("���� numbers ��ü : " + numbers);
		numbers.removeLast();
		System.out.println("���� �� number ��ü : " + numbers);
		System.out.println();
		
		
		// index 1�� ������ ��������
		// get(int index)
		System.out.println("* index 1�� ������ ��������");
		System.out.println("numbers ��ü : " + numbers);
		System.out.println("index1 ������ : " + numbers.get(1));
		System.out.println();
		
		
		// ���� size(ũ��, ����) ��������
		// size()
		System.out.println("* ���� size(ũ��, ����) ��������");
		System.out.println("numbers ��ü : " + numbers);
		System.out.println(" size : " + numbers.size());
		System.out.println();
		
		// ������ 15(���� o), 60�˻�(���� x) (��ġ�ϴµ����� ã�� �� �ش� index ��ȯ/ ������ -1 ��ȯ)
		// indexOf(Object o)
		System.out.println("* ������ 15 �˻�");
		System.out.println("numbers ��ü : " + numbers);
		System.out.println(" 15 ������ index(-1�� ��� �� ����) : " + numbers.indexOf(15));
		System.out.println("------------------------------------");
		System.out.println("* ������ 60 �˻�");
		System.out.println("numbers ��ü : " + numbers);
		System.out.println(" 60 ������ index(-1�� ��� �� ����) : " + numbers.indexOf(60));
		System.out.println();
		
		
		// for�� ���� �ݺ�
		System.out.println("* for�� ���� �ݺ�");
		System.out.println("numbers ��ü : " + numbers);
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println("index" + i + " : " + numbers.get(i));
		}
		System.out.println();
		
		
		
		
		
		
		/* Iterator�� ���� �ݺ� */
		// ��Ȯ�� �׽�Ʈ �ϱ����� ���ο� ArrayList ��ü ���� �� 5���� ��(10, 20, 30, 40, 50)�� ������� ����
		ArrayList numbers2 = new ArrayList();
		numbers2.addLast(10);
		numbers2.addLast(20);
		numbers2.addLast(30);
		numbers2.addLast(40);
		numbers2.addLast(50);
		
		System.out.println("* Iterator�� ���� �ݺ�");
		System.out.println("numbers ��ü : " + numbers2);
		
		// ArrayList�� ListIterator��ü�� ��ȯ
		ListIterator li = numbers2.listIterator();
		
		while(li.hasNext()) {
			int i = 0;
			System.out.println(li.next());
		}
		System.out.println();
		
		
		
		
		
		/* ListIterator add()�޼ҵ带 �׽�Ʈ�ϱ����� ���ο� ArrayList�� ListIterator ���� */
		// ��Ȯ�� �׽�Ʈ �ϱ����� ���ο� ArrayList ��ü ���� �� 5���� ��(10, 20, 30, 40, 50)�� ������� ����
		ArrayList numbers3 = new ArrayList();
		numbers3.addLast(10);
		numbers3.addLast(20);
		numbers3.addLast(30);
		numbers3.addLast(40);
		numbers3.addLast(50);
		
		ListIterator li2 = numbers3.listIterator();
		
		
		// ����� 30������ ���� ��ҿ� 35�����͸� �߰�
		System.out.println("* ����� 30������ ���� ��ҿ� 35�����͸� �߰�");
		System.out.println("numbers ��ü : " + numbers3);
		while(li2.hasNext()) {
			
			//next() ��ȯ���� Object Ÿ���̱⶧���� int�� ����ȯ �� int ������ ����
			int value = (int)li2.next();
			if(value == 30) {
				li2.add(35);
			}
		}
		System.out.println("���� �� numbers ��ü : " + numbers3);
		
		
		
		
		/* ListIterator remove()�޼ҵ带 �׽�Ʈ�ϱ����� ���ο� ArrayList�� ListIterator ���� */
		// ��Ȯ�� �׽�Ʈ �ϱ����� ���ο� ArrayList ��ü ���� �� 5���� ��(10, 20, 30, 40, 50)�� ������� ����
		ArrayList numbers4 = new ArrayList();
		numbers4.addLast(10);
		numbers4.addLast(20);
		numbers4.addLast(30);
		numbers4.addLast(40);
		numbers4.addLast(50);
		
		ListIterator li3 = numbers4.listIterator();
		
		
		// ����� 30������ ����
		System.out.println("* ����� 30������ ����");
		System.out.println("numbers ��ü : " + numbers4);
		while(li3.hasNext()) {
			
			//next() ��ȯ���� Object Ÿ���̱⶧���� int�� ����ȯ �� int ������ ����
			int value = (int)li3.next();
			if(value == 30) {
				li3.remove();
			}
		}
		System.out.println("���� �� numbers ��ü : " + numbers4);
		
		
		
	}

}
