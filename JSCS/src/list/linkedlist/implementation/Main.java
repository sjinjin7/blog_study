package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		
		//������ LinkedListŬ���� �ν��Ͻ�ȭ �� �������� numbers�� ����
		LinkedList numbers = new LinkedList();
		System.out.println("���� ���� ���");
		System.out.println(numbers);
		System.out.println();
		
		// ���� �� ��� �߰�
		System.out.println("*addFirst���");
		System.out.println("�߰��� : " + numbers);
		System.out.println("ù ��忡 30, 20, 10 ������ �߰�");
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		System.out.println("�߰� �� : " + numbers);
		System.out.println();
		
		
		// ���� �� ��� �߰�
		System.out.println("*addLast���");
		System.out.println("�߰��� : " + numbers);
		System.out.println("������ ��忡 40, 50, 60 ������ �߰�");
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);
		// node(int index)�޼��尡 public�� ��� ��밡���� ��ɹ�
		//System.out.println(numbers.node(3));
		System.out.println("�߰� �� : " + numbers);
		System.out.println();
		
		
		// �߰��� ��� �߰�
		System.out.println("*add(����,������)���");
		System.out.println("�߰� ��" + numbers);
		System.out.println("index�� 1, �����ʹ� 15 ��� �߰�");
		numbers.add(1, 15);
		System.out.println("�߰� �� : " + numbers);
		System.out.println();
		
		
		// ù ��� ����
		System.out.println("*removeFirst()���");
		System.out.println("���� �� : " + numbers);
		System.out.println("ù ��� ����");
		numbers.removeFirst();
		System.out.println("���� �� : " + numbers);
		System.out.println();
		
		
		// Ư�� ��ġ ��� ����
		System.out.println("*remove(index)���");
		System.out.println("���� �� : " + numbers);
		System.out.println("index 3 ��� ����");
		numbers.remove(3);
		System.out.println("���� �� : " + numbers);
		System.out.println();
		
		
		// ������ ��� ����
		System.out.println("*removeLast()���");
		System.out.println("���� �� : " + numbers);
		System.out.println("������ ��� ����");
		numbers.removeLast();
		System.out.println("���� �� : " + numbers);
		System.out.println();
		
		
		//LinkedList ũ�� 
		System.out.println("*size()���");
		System.out.println("������ LinkedList ��ü : " + numbers);
		System.out.println("���� LinkedList ��ü ũ��� " + numbers.size());
		
		// Ư�� ���� ����� ������ ��������
		System.out.println("*get(index)");
		System.out.println("������ LinkedList ��ü : " + numbers);
		System.out.println("index�� 3�� ���(���� 4��° ���)�� ������ ��������");
		System.out.println("index�� 3�� ���(���� 4��° ���) : " + numbers.get(3));
		System.out.println();
		
		// ������ �˻�(����� �ش� index ��ȯ / �������� ������ -1 ��ȯ)
		System.out.println("*indexOf(�˻�������)");
		System.out.println("������ LinkedList ��ü : " + numbers);
		System.out.println("������ 30(�����ϴ� ������) �˻� ");
		System.out.println("�˻���� : " + numbers.indexOf(30));
		System.out.println("������ 80(�������� �ʴ� ������) �˻� ");
		System.out.println("�˻���� : " + numbers.indexOf(80));
		System.out.println();
		
		
		/* ListIterator ���� */
		System.out.println("**ListIterator ����");
		// ������ LinkedList�� ListIterator Ÿ������ ��ȯ�Ͽ�
		// �������� i �� ����
		LinkedList.ListIterator i = numbers.listIterator();
		
		// add() ���� �׽�Ʈ
		System.out.println("next()�޼ҵ� ���");
		System.out.println("i.next() : " + i.next());
		System.out.println("i.next() : " + i.next());
		System.out.println("i.next() : " + i.next());
		System.out.println();
		
		/* hasNext()���� �׽�Ʈ */
		//hasNext()�׽�Ʈ ���� ���ο� ListIterator ������ ���(i2)
		LinkedList.ListIterator i2 = numbers.listIterator();
		System.out.println("*hasNext()����� �ݺ���");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("���� LinkedList : " + numbers);
		System.out.println();
		
		
		/* add()�����׽�Ʈ */
		// add()�׽�Ʈ�� ���� ���ο� ListIterator ���� �� ���(i3)
		LinkedList.ListIterator i3 = numbers.listIterator();
		System.out.println("*add()���(ListIterator�� add�޼ҵ�)");
		System.out.println("add() ����ϱ��� ���� ListLinked : " + numbers);
		System.out.println("ù��° ���� ����°��忡 ���� 10, 19 �����͸� ���� ��� �߰�");
		i3.add(10);
		i3.next();
		i3.add(19);
		System.out.println("�߰����� LinkedList : " + numbers);
		System.out.println();
		System.out.println(numbers);
		
		/* remove()���� �׽�Ʈ */
		// remove()�׽�Ʈ�� ���� ���ο� ListIterator ���� �� ���
		LinkedList.ListIterator i4 = numbers.listIterator();
		System.out.println("*remove()���(ListIterator�� remove�޼ҵ�)");
		System.out.println("remove�� ����ϱ����� LinkedList : " + numbers); 
		System.out.println("����° ���(19) ����");
		for(int k=0;k<2;k++){
			i4.next();
		}
		i4.remove();
		System.out.println("remove�� ��� ���� LinkedList : " + numbers);
		
	}
	
}
