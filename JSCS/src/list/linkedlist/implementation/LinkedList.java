package list.linkedlist.implementation;

public class LinkedList {


	/* ArrayList 구현해보기 */
	// 공부 홈페이지 https://opentutorials.org/module/1335/8857	
	
	/* LinkedList 객체 구현 */
	// 제일 첫 노드
	private Node head;
	// 제일 마지막 노드
	private Node tail;
	// LinkedList 크기(노드 갯수)
	private int size = 0;
	// 객치지향 프로그래밍 언어에선 노드가 객체로 구현 
	// 따라서 class로 구현
	private class Node{
		// 노드에 저장되는 데이터(Data field)
		private Object data;
		// 다음 노드(Link field)
		private Node next;
		// 값을 가지는 생성자 
		public Node(Object input) {
			// 넣는 값
			this.data = input;
			// 아직 다음에 어떤노드가 올지 모르기 때문에 null
			this.next = null;
		}
		// 노드를 생성했을 때 해당 노드 데이터를 확인하기 위해서
		// toString 구현
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	
	/* addFirst구현 */
	public void addFirst(Object input) {
		// 새로운 노드 생성(Object매개변수를 가진 생성자 사용)
		Node newNode = new Node(input);
		// 기존 head 노드가 
		//새로운 head 노드.next
		newNode.next = head;
		// 새로 생성한 노드가 head 노드
		head = newNode;
		// 노드 갯수 증가 => 크기 증가
		size++;
		//head.next가 null 이라는 것은 아직 노드가 한개도 없는경우
		// 첫노드를 생성했기때문에 첫노드는 head이자 tail
		if(head.next == null) {
			tail = head;
		}
	}
	
	/* addLast구현 */
	public void addLast(Object input) {
		Node newNode = new Node(input);
		// size가 0이라는 것은 노드가 아무것도 없는 것을 의미
		// 노드가 없을시 addFirst()를 사용하도록 설계
		// (if를통해서 addFirst를 굳이 사용한 이유는
		// 노드가 아무것도 없는상태에서는 tail또한 null인데
		// tail.next호출하면 에러가 날 수 있음)
		if(size == 0) {
			addFirst(input);
		} else {
			// 기존 마지막 노드.next에 새로운 노드를 저장
			tail.next = newNode;
			// tail을 새로운 마지막 노드를 저장
			tail = newNode;
			// 노드의 갯수 증가 => 크기 증가
			size++;
		}
	}
	
	/* node를 리턴하는 메서드 구현 */
	// 리턴값 자체가 노드이기 때문에 외부에 노출하면 안됩니다.
	// 따라서 public을 사용하지 않았습니다.
	Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) {
			x=x.next;
		}
		return x;
	}
	
	
	
	/* add구현 */
	public void add(int k, Object input) {
		// k가 0이라는 말은 제일 첫번째 노드를 추가 한다는 의미기 때문에 addFirst사용
		if(k == 0) {
			addFirst(input);
		} else {
			// temp1 새로추가될 노드의 앞에 있을 노드
			Node temp1 = node(k-1);
			// temp2 새로추가될 노드의 뒤에 있을 노드
			Node temp2 = temp1.next;
			// 새로운 노드 newNode생성
			Node newNode = new Node(input);
			// temp1.next는 기존 temp2였지만 newNode로 변경
			temp1.next = newNode;
			// newNode.next가 temp2를 가리키도록 저장
			newNode.next = temp2;
			// 크기증가
			size++;
			//newNode.next == null이라는 말은
			//새로 생성된 노드기 제일 마지막 노드라는 의미이기때문에
			// tail을 새로 생성된 newNode로 저장 
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	
	/* 출력 구현 */
	public String toString() {
		//head 가 null이라는 것은 노드가 아무것도 없다는 것을 의미
		if(head == null) {
			return "[]";
		} 
		//head를 temp에 저장
		Node temp = head;
		String str = "[";
		//temp.next가 null일경우 반복 멈춤
		while(temp.next != null) {
			// 현재의 노드 스트링에 출력
			str += temp.data + ",";
			// 다음의 노드가 현재의 노드가 되도록 저장
			temp = temp.next;
		}
		//제일 마지막 노드의 데이터는 출력되지 않았기 때문에 출력되도록 추가
		str += temp.data;
		
		return str+"]";
	}
	
	
	/* 삭제 구현 */
	/* 첫 노드 삭제 */
	public Object removeFirst() {
		// 참조변수 temp에 head를 저장
		Node temp = head;
		// head.next를 통해서 두번째 노드를 head에 저장
		head = head.next;
		// 삭제 될 데이터 Object타입 returnData참조변수에 저장
		Object returnData = temp.data;
		// temp 비움(첫노듯 삭제)
		temp = null;
		// 한개의 노드가 줄엇음으로 크기도 줄임
		size--;
		// 삭제된 데이터 반환
		return returnData;
	}
	
	
	/* 특정 위치 노드 삭제 */
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
	
	/* 마지막 위치 노드 삭제 */
	public Object removeLast() {
		return remove(size-1);
	}
	
	
	/* size 리턴 */
	public int size() {
		return size;
	}
	
	/* 특정 순서의 노드 데이터 리턴 */
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	
	/* 데이터 검색 */
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
	
	
	/* ListIterator 구현 */
	
	// ListerIterator 클래스 리턴
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	// ListIterator 클래스 구현
	public class ListIterator {
		// 다음 노드를 가리키는 변수
		private Node next;
		// 다음 노드를 가기 전의 노드를 가리키는 변수
		private Node lastReturned;
		// 노드를 옮겨감에따라 현재의 위치를 저장하는 변수
		private int nextIndex;
		
		//ListIterator 생성자
		// 제일 첫 노등 head가 next변수에 저장
		ListIterator(){
			next=head;
		}
		
		/* next메소드 */ 
		// 현재의 node 데이터를 반환하고 next 변수에 다음 노드를 저장시킵니다.
		public Object next() {
			// next는 지금 현재 노드 
			// 다음 노드로 옮기기 전 현재의노드를 lastReturned 변수에 저장
			lastReturned = next;
			// 다음 노드를 next 변수에 저장
			next = next.next;
			// 노드가 이동하였기때문에 위치 nextIndex변수도 증가
			nextIndex++;
			// 노드를 옮기기전의 노드의 데이터 값을 반환
			return lastReturned.data;
		}
		
		
		/* hasNext구현 */
		public boolean hasNext() {
			//nextIndex가 size보다 작으면 true를 반환
			return nextIndex < size();
		}
		
		/* add구현 */
		public void add(Object input) {
			Node newNode = new Node(input);
			// 아직 next()메소드를 한번도 진행하지 않은경우
			// 제일 첫노드를 추가하기위해
			if(lastReturned == null) {
				// 새로운 노드를 head변수에 저장
				head = newNode;
				// 현재의 next변수를 새로운노드의next에 저장
				newNode.next = next;
			} else {
				//첫번째 노드가 아닌경우
				// 지금 현재 가리키고있는 노드의 next에 newNode(새로운노드)를 저장
				lastReturned.next = newNode;
				// 새로운 노드의 next에 현재의 next변수를 저장
				newNode.next = next;
			}
			// 현재가리키고 있는 노드를 새로운 노드로 변경
			lastReturned = newNode;
			// nextIndex증가(현재의 위치 주소)
			nextIndex++;
			//노드의 갯수가 증가하였기때문에 size변수도 증가
			size++;
		}
		
		
		/* remove 구현 */
		public void remove() {
			// remove는 현재의 노드(lastReturned)를 삭제하는 것인데 
			// next()를 한번도 사용하지 않았따면 lastReturned는 null
			// 따라서 if문을 통해 해당상황시 에러를 발생시킴
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			// nextIndex는 다음 노드의 Index입니다.
			// 목표는 현재의 노드(lastReturned)를 삭제하는 것이기때문에
			// 현재노드의 Index(nextIndex-1)을 해줍니다.
			LinkedList.this.remove(nextIndex-1);
			//한개의 노드가 삭제되었기때문에 주소도 한칸씩 앞당겨집니다.
			nextIndex--;
		}
		
		
	}
	
	
}// class LinkedList 종료
