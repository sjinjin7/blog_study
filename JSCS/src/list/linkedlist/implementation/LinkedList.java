package list.linkedlist.implementation;

public class LinkedList {


	/* ArrayList �����غ��� */
	// ���� Ȩ������ https://opentutorials.org/module/1335/8857	
	
	/* LinkedList ��ü ���� */
	// ���� ù ���
	private Node head;
	// ���� ������ ���
	private Node tail;
	// LinkedList ũ��(��� ����)
	private int size = 0;
	// ��ġ���� ���α׷��� ���� ��尡 ��ü�� ���� 
	// ���� class�� ����
	private class Node{
		// ��忡 ����Ǵ� ������(Data field)
		private Object data;
		// ���� ���(Link field)
		private Node next;
		// ���� ������ ������ 
		public Node(Object input) {
			// �ִ� ��
			this.data = input;
			// ���� ������ ���尡 ���� �𸣱� ������ null
			this.next = null;
		}
		// ��带 �������� �� �ش� ��� �����͸� Ȯ���ϱ� ���ؼ�
		// toString ����
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	
	/* addFirst���� */
	public void addFirst(Object input) {
		// ���ο� ��� ����(Object�Ű������� ���� ������ ���)
		Node newNode = new Node(input);
		// ���� head ��尡 
		//���ο� head ���.next
		newNode.next = head;
		// ���� ������ ��尡 head ���
		head = newNode;
		// ��� ���� ���� => ũ�� ����
		size++;
		//head.next�� null �̶�� ���� ���� ��尡 �Ѱ��� ���°��
		// ù��带 �����߱⶧���� ù���� head���� tail
		if(head.next == null) {
			tail = head;
		}
	}
	
	/* addLast���� */
	public void addLast(Object input) {
		Node newNode = new Node(input);
		// size�� 0�̶�� ���� ��尡 �ƹ��͵� ���� ���� �ǹ�
		// ��尡 ������ addFirst()�� ����ϵ��� ����
		// (if�����ؼ� addFirst�� ���� ����� ������
		// ��尡 �ƹ��͵� ���»��¿����� tail���� null�ε�
		// tail.nextȣ���ϸ� ������ �� �� ����)
		if(size == 0) {
			addFirst(input);
		} else {
			// ���� ������ ���.next�� ���ο� ��带 ����
			tail.next = newNode;
			// tail�� ���ο� ������ ��带 ����
			tail = newNode;
			// ����� ���� ���� => ũ�� ����
			size++;
		}
	}
	
	/* node�� �����ϴ� �޼��� ���� */
	// ���ϰ� ��ü�� ����̱� ������ �ܺο� �����ϸ� �ȵ˴ϴ�.
	// ���� public�� ������� �ʾҽ��ϴ�.
	Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) {
			x=x.next;
		}
		return x;
	}
	
	
	
	/* add���� */
	public void add(int k, Object input) {
		// k�� 0�̶�� ���� ���� ù��° ��带 �߰� �Ѵٴ� �ṉ̀� ������ addFirst���
		if(k == 0) {
			addFirst(input);
		} else {
			// temp1 �����߰��� ����� �տ� ���� ���
			Node temp1 = node(k-1);
			// temp2 �����߰��� ����� �ڿ� ���� ���
			Node temp2 = temp1.next;
			// ���ο� ��� newNode����
			Node newNode = new Node(input);
			// temp1.next�� ���� temp2������ newNode�� ����
			temp1.next = newNode;
			// newNode.next�� temp2�� ����Ű���� ����
			newNode.next = temp2;
			// ũ������
			size++;
			//newNode.next == null�̶�� ����
			//���� ������ ���� ���� ������ ����� �ǹ��̱⶧����
			// tail�� ���� ������ newNode�� ���� 
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	
	/* ��� ���� */
	public String toString() {
		//head �� null�̶�� ���� ��尡 �ƹ��͵� ���ٴ� ���� �ǹ�
		if(head == null) {
			return "[]";
		} 
		//head�� temp�� ����
		Node temp = head;
		String str = "[";
		//temp.next�� null�ϰ�� �ݺ� ����
		while(temp.next != null) {
			// ������ ��� ��Ʈ���� ���
			str += temp.data + ",";
			// ������ ��尡 ������ ��尡 �ǵ��� ����
			temp = temp.next;
		}
		//���� ������ ����� �����ʹ� ��µ��� �ʾұ� ������ ��µǵ��� �߰�
		str += temp.data;
		
		return str+"]";
	}
	
	
	/* ���� ���� */
	/* ù ��� ���� */
	public Object removeFirst() {
		// �������� temp�� head�� ����
		Node temp = head;
		// head.next�� ���ؼ� �ι�° ��带 head�� ����
		head = head.next;
		// ���� �� ������ ObjectŸ�� returnData���������� ����
		Object returnData = temp.data;
		// temp ���(ù��� ����)
		temp = null;
		// �Ѱ��� ��尡 �پ������� ũ�⵵ ����
		size--;
		// ������ ������ ��ȯ
		return returnData;
	}
	
	
	/* Ư�� ��ġ ��� ���� */
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	/* ������ ��ġ ��� ���� */
	public Object removeLast() {
		return remove(size-1);
	}
	
	
	/* size ���� */
	public int size() {
		return size;
	}
	
	/* Ư�� ������ ��� ������ ���� */
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	
	/* ������ �˻� */
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	
	
	/* ListIterator ���� */
	
	// ListerIterator Ŭ���� ����
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	// ListIterator Ŭ���� ����
	public class ListIterator {
		// ���� ��带 ����Ű�� ����
		private Node next;
		// ���� ��带 ���� ���� ��带 ����Ű�� ����
		private Node lastReturned;
		// ��带 �Űܰ������� ������ ��ġ�� �����ϴ� ����
		private int nextIndex;
		
		//ListIterator ������
		// ���� ù ��� head�� next������ ����
		ListIterator(){
			next=head;
		}
		
		/* next�޼ҵ� */ 
		// ������ node �����͸� ��ȯ�ϰ� next ������ ���� ��带 �����ŵ�ϴ�.
		public Object next() {
			// next�� ���� ���� ��� 
			// ���� ���� �ű�� �� �����ǳ�带 lastReturned ������ ����
			lastReturned = next;
			// ���� ��带 next ������ ����
			next = next.next;
			// ��尡 �̵��Ͽ��⶧���� ��ġ nextIndex������ ����
			nextIndex++;
			// ��带 �ű������ ����� ������ ���� ��ȯ
			return lastReturned.data;
		}
		
		
		/* hasNext���� */
		public boolean hasNext() {
			//nextIndex�� size���� ������ true�� ��ȯ
			return nextIndex < size();
		}
		
		/* add���� */
		public void add(Object input) {
			Node newNode = new Node(input);
			// ���� next()�޼ҵ带 �ѹ��� �������� �������
			// ���� ù��带 �߰��ϱ�����
			if(lastReturned == null) {
				// ���ο� ��带 head������ ����
				head = newNode;
				// ������ next������ ���ο�����next�� ����
				newNode.next = next;
			} else {
				//ù��° ��尡 �ƴѰ��
				// ���� ���� ����Ű���ִ� ����� next�� newNode(���ο���)�� ����
				lastReturned.next = newNode;
				// ���ο� ����� next�� ������ next������ ����
				newNode.next = next;
			}
			// ���簡��Ű�� �ִ� ��带 ���ο� ���� ����
			lastReturned = newNode;
			// nextIndex����(������ ��ġ �ּ�)
			nextIndex++;
			//����� ������ �����Ͽ��⶧���� size������ ����
			size++;
		}
		
		
		/* remove ���� */
		public void remove() {
			// remove�� ������ ���(lastReturned)�� �����ϴ� ���ε� 
			// next()�� �ѹ��� ������� �ʾҵ��� lastReturned�� null
			// ���� if���� ���� �ش��Ȳ�� ������ �߻���Ŵ
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			// nextIndex�� ���� ����� Index�Դϴ�.
			// ��ǥ�� ������ ���(lastReturned)�� �����ϴ� ���̱⶧����
			// �������� Index(nextIndex-1)�� ���ݴϴ�.
			LinkedList.this.remove(nextIndex-1);
			//�Ѱ��� ��尡 �����Ǿ��⶧���� �ּҵ� ��ĭ�� �մ�����ϴ�.
			nextIndex--;
		}
		
		
	}
	
	
}// class LinkedList ����
