package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		
		//구현한 LinkedList클래스 인스턴스화 후 참조변수 numbers에 저장
		LinkedList numbers = new LinkedList();
		System.out.println("생성 직후 출력");
		System.out.println(numbers);
		System.out.println();
		
		// 제일 앞 노드 추가
		System.out.println("*addFirst사용");
		System.out.println("추가전 : " + numbers);
		System.out.println("첫 노드에 30, 20, 10 순으로 추가");
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		System.out.println("추가 후 : " + numbers);
		System.out.println();
		
		
		// 제일 뒤 노드 추가
		System.out.println("*addLast사용");
		System.out.println("추가전 : " + numbers);
		System.out.println("마지막 노드에 40, 50, 60 순으로 추가");
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);
		// node(int index)메서드가 public일 경우 사용가능한 명령문
		//System.out.println(numbers.node(3));
		System.out.println("추가 후 : " + numbers);
		System.out.println();
		
		
		// 중간에 노드 추가
		System.out.println("*add(순서,데이터)사용");
		System.out.println("추가 전" + numbers);
		System.out.println("index는 1, 데이터는 15 노드 추가");
		numbers.add(1, 15);
		System.out.println("추가 후 : " + numbers);
		System.out.println();
		
		
		// 첫 노드 삭제
		System.out.println("*removeFirst()사용");
		System.out.println("삭제 전 : " + numbers);
		System.out.println("첫 노드 삭제");
		numbers.removeFirst();
		System.out.println("삭제 후 : " + numbers);
		System.out.println();
		
		
		// 특정 위치 노드 삭제
		System.out.println("*remove(index)사용");
		System.out.println("삭제 전 : " + numbers);
		System.out.println("index 3 노드 삭제");
		numbers.remove(3);
		System.out.println("삭제 후 : " + numbers);
		System.out.println();
		
		
		// 마지막 노드 삭제
		System.out.println("*removeLast()사용");
		System.out.println("삭제 전 : " + numbers);
		System.out.println("마지막 노드 삭제");
		numbers.removeLast();
		System.out.println("삭제 후 : " + numbers);
		System.out.println();
		
		
		//LinkedList 크기 
		System.out.println("*size()사용");
		System.out.println("현재의 LinkedList 객체 : " + numbers);
		System.out.println("현재 LinkedList 객체 크기는 " + numbers.size());
		
		// 특정 순서 노드의 데이터 가져오기
		System.out.println("*get(index)");
		System.out.println("현재의 LinkedList 객체 : " + numbers);
		System.out.println("index가 3인 노드(순서 4번째 노드)의 데이터 가져오기");
		System.out.println("index가 3인 노드(순서 4번째 노드) : " + numbers.get(3));
		System.out.println();
		
		// 데이터 검색(존재시 해당 index 반환 / 존재하지 않을시 -1 반환)
		System.out.println("*indexOf(검색데이터)");
		System.out.println("현재의 LinkedList 객체 : " + numbers);
		System.out.println("데이터 30(존재하는 데이터) 검색 ");
		System.out.println("검색결과 : " + numbers.indexOf(30));
		System.out.println("데이터 80(존재하지 않는 데이터) 검색 ");
		System.out.println("검색결과 : " + numbers.indexOf(80));
		System.out.println();
		
		
		/* ListIterator 구현 */
		System.out.println("**ListIterator 구현");
		// 현재의 LinkedList를 ListIterator 타입으로 반환하여
		// 참조변수 i 에 저장
		LinkedList.ListIterator i = numbers.listIterator();
		
		// add() 구현 테스트
		System.out.println("next()메소드 사용");
		System.out.println("i.next() : " + i.next());
		System.out.println("i.next() : " + i.next());
		System.out.println("i.next() : " + i.next());
		System.out.println();
		
		/* hasNext()구현 테스트 */
		//hasNext()테스트 위해 새로운 ListIterator 생성후 사용(i2)
		LinkedList.ListIterator i2 = numbers.listIterator();
		System.out.println("*hasNext()사용한 반복문");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("실제 LinkedList : " + numbers);
		System.out.println();
		
		
		/* add()구현테스트 */
		// add()테스트를 위해 새로운 ListIterator 생성 후 사용(i3)
		LinkedList.ListIterator i3 = numbers.listIterator();
		System.out.println("*add()사용(ListIterator의 add메소드)");
		System.out.println("add() 사용하기전 현재 ListLinked : " + numbers);
		System.out.println("첫번째 노드와 세번째노드에 각각 10, 19 데이터를 가진 노드 추가");
		i3.add(10);
		i3.next();
		i3.add(19);
		System.out.println("추가후의 LinkedList : " + numbers);
		System.out.println();
		System.out.println(numbers);
		
		/* remove()구현 테스트 */
		// remove()테스트를 위해 새로운 ListIterator 생성 후 사용
		LinkedList.ListIterator i4 = numbers.listIterator();
		System.out.println("*remove()사용(ListIterator의 remove메소드)");
		System.out.println("remove를 사용하기전의 LinkedList : " + numbers); 
		System.out.println("세번째 노드(19) 삭제");
		for(int k=0;k<2;k++){
			i4.next();
		}
		i4.remove();
		System.out.println("remove를 사용 후의 LinkedList : " + numbers);
		
	}
	
}
