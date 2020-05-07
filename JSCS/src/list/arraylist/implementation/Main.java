package list.arraylist.implementation;

import list.arraylist.implementation.ArrayList.ListIterator;

public class Main {

	/* 구현한 ArrayList클래스 사용해보기 */
	/*한계점 : 요소가 늘어나면 해당 배열의 크기가 늘어난 것은 구현하지 못함*/
	public static void main(String[] args) {
		
		/* ArrayList를 개체화 시켜 ArrrayList numbers 참조변수에 저장 */
		ArrayList numbers = new ArrayList();
		
		// 10, 20, 30, 40 차례로 데이터 집어넣기
		//addLast(Object element)
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		System.out.println("* 10,20,30,40 데이터 집어넣기");
		System.out.println(numbers);
		System.out.println();

		
		// index1에 15넣기
		// add(int index, Object element)
		System.out.println("* index1에 15값 넣기");
		System.out.println("기존 numbers 객체 : " + numbers);
		numbers.add(1, 15);
		System.out.println("추가 이후 numbers 객체 : " + numbers);
		System.out.println();
		
		// 제일 첫 요소에 1 값 넣기
		// addFirst(Object element)
		System.out.println("* 첫 요소(index0)에 15값 넣기");
		System.out.println("기존 numbers 객체 : " + numbers);
		numbers.addFirst(1);
		System.out.println("추가 후 number 객체 : " + numbers);
		System.out.println();
		
		
		// index 3의 데이터 삭제
		// remove(int index)
		System.out.println("* index 3의 데이터 삭제");
		System.out.println("기존 numbers 객체 : " + numbers);
		numbers.remove(3);
		System.out.println("적용 후 number 객체 : " + numbers);
		System.out.println();
		
		
		// 맨 앞의 요소(index 0) 데이터 삭제
		// removeFirst()
		System.out.println("* 맨 앞의 요소(index 0) 데이터 삭제");
		System.out.println("기존 numbers 객체 : " + numbers);
		numbers.removeFirst();
		System.out.println("적용 후 number 객체 : " + numbers);
		System.out.println();
		
		
		// 마지막 요소 데이터 삭제
		// removeLast()
		System.out.println("* 마지막 요소 데이터 삭제");
		System.out.println("기존 numbers 객체 : " + numbers);
		numbers.removeLast();
		System.out.println("적용 후 number 객체 : " + numbers);
		System.out.println();
		
		
		// index 1의 데이터 가져오기
		// get(int index)
		System.out.println("* index 1의 데이터 가져오기");
		System.out.println("numbers 객체 : " + numbers);
		System.out.println("index1 데이터 : " + numbers.get(1));
		System.out.println();
		
		
		// 현재 size(크가, 길이) 가져오기
		// size()
		System.out.println("* 현재 size(크가, 길이) 가져오기");
		System.out.println("numbers 객체 : " + numbers);
		System.out.println(" size : " + numbers.size());
		System.out.println();
		
		// 데이터 15(존재 o), 60검색(존재 x) (일치하는데이터 찾을 시 해당 index 반환/ 없을시 -1 반환)
		// indexOf(Object o)
		System.out.println("* 데이터 15 검색");
		System.out.println("numbers 객체 : " + numbers);
		System.out.println(" 15 데이터 index(-1일 경우 값 없음) : " + numbers.indexOf(15));
		System.out.println("------------------------------------");
		System.out.println("* 데이터 60 검색");
		System.out.println("numbers 객체 : " + numbers);
		System.out.println(" 60 데이터 index(-1일 경우 값 없음) : " + numbers.indexOf(60));
		System.out.println();
		
		
		// for을 통해 반복
		System.out.println("* for을 통한 반복");
		System.out.println("numbers 객체 : " + numbers);
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println("index" + i + " : " + numbers.get(i));
		}
		System.out.println();
		
		
		
		
		
		
		/* Iterator을 통한 반복 */
		// 명확히 테스트 하기위해 새로운 ArrayList 객체 선언 후 5개의 값(10, 20, 30, 40, 50)을 순서대로 넣음
		ArrayList numbers2 = new ArrayList();
		numbers2.addLast(10);
		numbers2.addLast(20);
		numbers2.addLast(30);
		numbers2.addLast(40);
		numbers2.addLast(50);
		
		System.out.println("* Iterator을 통한 반복");
		System.out.println("numbers 객체 : " + numbers2);
		
		// ArrayList를 ListIterator객체로 변환
		ListIterator li = numbers2.listIterator();
		
		while(li.hasNext()) {
			int i = 0;
			System.out.println(li.next());
		}
		System.out.println();
		
		
		
		
		
		/* ListIterator add()메소드를 테스트하기위해 새로운 ArrayList와 ListIterator 생성 */
		// 명확히 테스트 하기위해 새로운 ArrayList 객체 선언 후 5개의 값(10, 20, 30, 40, 50)을 순서대로 넣음
		ArrayList numbers3 = new ArrayList();
		numbers3.addLast(10);
		numbers3.addLast(20);
		numbers3.addLast(30);
		numbers3.addLast(40);
		numbers3.addLast(50);
		
		ListIterator li2 = numbers3.listIterator();
		
		
		// 요소중 30데이터 다음 요소에 35데이터를 추가
		System.out.println("* 요소중 30데이터 다음 요소에 35데이터를 추가");
		System.out.println("numbers 객체 : " + numbers3);
		while(li2.hasNext()) {
			
			//next() 반환값이 Object 타입이기때문에 int로 형변환 후 int 변수에 저장
			int value = (int)li2.next();
			if(value == 30) {
				li2.add(35);
			}
		}
		System.out.println("변경 후 numbers 객체 : " + numbers3);
		
		
		
		
		/* ListIterator remove()메소드를 테스트하기위해 새로운 ArrayList와 ListIterator 생성 */
		// 명확히 테스트 하기위해 새로운 ArrayList 객체 선언 후 5개의 값(10, 20, 30, 40, 50)을 순서대로 넣음
		ArrayList numbers4 = new ArrayList();
		numbers4.addLast(10);
		numbers4.addLast(20);
		numbers4.addLast(30);
		numbers4.addLast(40);
		numbers4.addLast(50);
		
		ListIterator li3 = numbers4.listIterator();
		
		
		// 요소중 30데이터 삭제
		System.out.println("* 요소중 30데이터 삭제");
		System.out.println("numbers 객체 : " + numbers4);
		while(li3.hasNext()) {
			
			//next() 반환값이 Object 타입이기때문에 int로 형변환 후 int 변수에 저장
			int value = (int)li3.next();
			if(value == 30) {
				li3.remove();
			}
		}
		System.out.println("변경 후 numbers 객체 : " + numbers4);
		
		
		
	}

}
