package list.arraylist.implementation;

public class ArrayList {

	/* ArrayList �����غ��� */
	// ���� Ȩ������ https://opentutorials.org/module/1335/8715
	// ���� http://tcpschool.com/java/java_collectionFramework_iterator
	
	/* ���� �� ũ�� ���� */
	// �ʱ� ���� 0 ���� ����
	private int size = 0;
	
	
	/* ObjectŸ���� �迭 (ũ��100)���� */
	private Object[] elementData = new Object[100];
	
	
	/* add���� */
	//�ش� ��ü ������ ��� �߰�
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		//ù��° ��Ҹ� ä���⶧���� ���� ��Ҹ� ���ϰ� size�� +1
		size++;
		return true;
		
	}//addLast()����
	
	
	/* ���� ù��ҿ� �������߰� */
	public boolean addFirst(Object element) {
		//add(int index, Object element)�޼��� Ȱ��
		return add(0, element);
	}
	
	
	/* ������� �߰� */
	public boolean add(int index, Object element) {
		//������ġ�� ���� �ֱ� ���ؼ� �� ��������Һ��� �ڷ� �ϳ��� �ش� ���� �ε������� ���� �̵� ���Ѿ���
		
		//ex. 10(index 0), 20(index 1), 30(index 2), 40(index 3)�� ��Ҹ� ������ �ִ� ArrayList
		//��ü�� �ִٰ� �����մϴ�. index 1�� 15�� ���� �������� �մϴ�.
		// �׷��ٸ� ���� index3�� �ִ� 40�� index4�� �Űܾ��մϴ�.
		// index2�� �� 30�� index3 ���� �̵�
		// index1�� �� 20�� index2���� �̵�
		// ���� �ű�� ���� �Ʒ��� ����
		/*
			elementData[4] = elementData[3];
			elementData[3] = elementData[2];
			elementData[2] = elementData[1];
		*/
		//���� �ڵ�� ��Ģ���� ���̱� ������ for�� ���
		for(int i = size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		
		// �ٿű� �� ���ο� ���� index1�� ����
		elementData[index] = element;
		
		//ũ�Ⱑ Ŀ�����Ƿ� size���� +1
		size++;
		
		return true;
	}//add()����
	
	
	/* toString()�� ���� ������Ȯ�� */
	public String toString() {
		
		String str = "[ ";
				
		for(int i = 0; i< size; i++) {
			str += elementData[i];
			if(i<size-1) {
				str += ",";
			}
			
		}
		
		return str + " ]";
	}//toString() ����
	
	
	/* ���� ��� ������ ���� */
	public Object remove(int index) {
		
		Object removed = elementData[index];
		
		// �߰��� ��Ҹ� ������ List�� ������� ������� �ʱ�빮�� ������� �ſ�� ���� ��Ұ� ��ĭ�� ������ �̵��մϴ�.
		// ���������δ� ���ٷ����ϴ� index�� �ִ°��� �ش� index���� ������ ��������μ� �����ϰ��� �ϴ� ���� ���۴ϴ�.
		//ex. 10(index 0), 20(index 1), 30(index 2), 40(index 3)�� ��Ҹ� ������ �ִ� ArrayList
		//��ü�� �ִٰ� �����մϴ�. index 1�� ���� �����ϴ� ���� ��ǥ���մϴ�.
		// �׷��ٸ� ���� index2�� �ִ� 30�� index1�� �Ű� ���� ����ϴ�.
		// index3�� �� 30�� index2 ���� �̵�
		// ���� �ű�� ���� �Ʒ��� ����
		/*
			elementData[1] = elementData[2];
			elementData[2] = elementData[3];
		*/
		// ���� �ڵ带 for�� ���� ����
		for(int i = index + 1; i <= size -1; i++) {
			elementData[i-1] = elementData[i];
		}
		
		//�ѿ�Ұ� ����� ������ size -1
		size--;
		
		//�Ǹ����� index�� ���� ���� ���� �����Ƿ� null���� ����
		elementData[size] = null;
		
		//������ �����͸� ��ȣ��
		return removed;
	}
	
	
	/* ù ��� ���� */
	public Object removeFirst() {
		//remove(int index)�� Ȱ��
		return remove(0);
	}
	
	
	/* ������ ��� ���� */
	public Object removeLast() {
		//remove(int index)�� Ȱ��
		//�Ǹ����� ��� index�� size-1 �Դϴ�.���� size-1�� Ȱ���մϴ�.
		return remove(size-1);
	}

	
	/* ���� index ��� ������ �������� */
	public Object get(int index) {
		return elementData[index];
	}
	
	
	/* size �������� */
	public int size() {
		return size;
	}
	
	
	/* �������� index �˻� */
	// �����Ͱ� ����� �ش� index��ȯ
	// �����Ͱ� �������� ���� �� -1��ȯ
	public int indexOf(Object o) {
		//��ü ��ü�� size ũ�⸸ŭ for�� ���� Ž��
		for(int i = 0; i < size; i++) {
			//ã���� �ϴ� ������(o)�� �ش� index�� ������(elementData[i])�� ��ġ��
			if(o.equals(elementData[i])) {
				//�ش� index ���� ��ȯ
				return i;
			}
		}
		
		// for�� ���� Ž���� �Ͽ����� ��ġ�ϴ� �����͸� ã�� �������� -1 int���� ��ȯ
		return -1;
	}
	
	
	/* ArrayList ��ü Iterator��ü�� ��ȯ */
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	/* ListIterator Class */
	public class ListIterator{
		
		//Index ���� 0���� ����
		private int nextIndex = 0;
		
		
		//���� ��Ұ� ������ �ÿ� true�� ��ȯ, ������ false�� ��ȯ
		//������ index�� ���� nextIndex
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		
		//���� ��� �����͸� ��ȯ
		public Object next(){
			//nextIndex ��ü�� ������ Index�� �빮�� �ش� Index�� elementData[index]�� ����Ͽ� �����͸� ��ȯ ��
			// index�� +1 ����
			return elementData[nextIndex++];
		}
		
		
		//���� ��Ұ� ������ �� true�� ��ȯ
		//������ index�� ���� nextIndex
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		
		
		//���� ��� �����͸� ��ȯ
		public Object previous() {
			//���� ��ҵ����͸� ��ȯ�ؾ��ϱ�빮�� index�� ���� -1�� ���� �� elementData[index]�� ���� ������ ��ȯ
			return elementData[--nextIndex];
		}
		
		
		// next() Ȥ�� previous()���� ��ȯ�� ���� ������ ���  ���� ��ҿ� �����͸� �߰�
		// ���� ListIterator������ remove�� next(), previous() �Ѵ� ������ �޼ҵ�
		public void add(Object element) {
			//ArrayList���� ������ add(int index, Object element)�� ���
			//���� Index�� nextIndex�� ��� �� +1����
			ArrayList.this.add(nextIndex++, element);
		}
		
		
		// next() ���� ��ȯ�� ���� ������ ��Ҹ� ���� 
		// ���� ListIterator������ remove�� next(), previous() �Ѵ� ������ �޼ҵ�
		public void remove() {
			// next(), �޼��� ���� �� nextIndex�� ���� ����� Index�� ������ 
			// ������ Index�� ǥ���ϱ� ���� -1�� ����
			ArrayList.this.remove(nextIndex-1);
			
			//������ index���� ��ĭ ������ ������⶧���� -1�� ��������
			// �������� 0, 1, 2, 3, 4�� index�� �ֽ��ϴ�.
			// ������ ListIterator�� next()�޼ҵ带 ���� index1�� ���� ��ȯ�� �Ȱ�� nextIndex�� 2�ϰ��Դϴ�.
			// (nextIndex�� ������ Index�� ����Ű�� ���� �̱� �����Դϴ�.)
			// ���⼭ remove()�� ����ϰԵǸ� index1�� ����Ǿ� �ִ� �����Ͱ� �������鼭 index2�� ���� ����˴ϴ�.
			// ������ Index���� idnex2������ index1�� ������Ա� ������ idnex���� ������ �̵��ϱ� ���ؼ� -1�� ���ݴϴ�.
			// ���� �̷��� ������ ���� ��� next()�޼ҵ带 ����� index1�� ������� ���� �и��� �����Կ��� ��ȯ�� ���� ���ϱ� �����Դϴ�.
			nextIndex--;
		}
	}
	
}
