package list.arraylist.implementation;

public class ArrayList {

	/* ArrayList 구현해보기 */
	// 공부 홈페이지 https://opentutorials.org/module/1335/8715
	// 참고 http://tcpschool.com/java/java_collectionFramework_iterator
	
	/* 값이 들어간 크기 변수 */
	// 초기 변수 0 으로 셋팅
	private int size = 0;
	
	
	/* Object타입의 배열 (크기100)생성 */
	private Object[] elementData = new Object[100];
	
	
	/* add구현 */
	//해당 객체 마지막 요소 추가
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		//첫번째 요소를 채웠기때문에 다음 요소를 향하게 size를 +1
		size++;
		return true;
		
	}//addLast()종료
	
	
	/* 제일 첫요소에 데이터추가 */
	public boolean addFirst(Object element) {
		//add(int index, Object element)메서드 활용
		return add(0, element);
	}
	
	
	/* 지정요소 추가 */
	public boolean add(int index, Object element) {
		//지정위치에 값을 넣기 위해서 맨 마지막요소부터 뒤로 하나씩 해당 지정 인덱스까지 값을 이동 시켜야함
		
		//ex. 10(index 0), 20(index 1), 30(index 2), 40(index 3)의 요소를 가지고 있는 ArrayList
		//객체가 있다고 가정합니다. index 1에 15의 값을 넣을려고 합니다.
		// 그렇다면 먼저 index3에 있는 40을 index4에 옮겨야합니다.
		// index2의 값 30을 index3 으로 이동
		// index1의 값 20을 index2으로 이동
		// 값을 옮기는 과정 아래와 같음
		/*
			elementData[4] = elementData[3];
			elementData[3] = elementData[2];
			elementData[2] = elementData[1];
		*/
		//위의 코드는 규칙성을 보이기 때문에 for을 사용
		for(int i = size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		
		// 다옮긴 후 새로운 값을 index1에 넣음
		elementData[index] = element;
		
		//크기가 커졌으므로 size또한 +1
		size++;
		
		return true;
	}//add()종료
	
	
	/* toString()을 통한 데이터확인 */
	public String toString() {
		
		String str = "[ ";
				
		for(int i = 0; i< size; i++) {
			str += elementData[i];
			if(i<size-1) {
				str += ",";
			}
			
		}
		
		return str + " ]";
	}//toString() 종료
	
	
	/* 지정 요소 데이터 삭제 */
	public Object remove(int index) {
		
		Object removed = elementData[index];
		
		// 중간의 요소를 삭제시 List는 빈공간을 허용하지 않기대문에 빈공간을 매우기 위해 요소가 한칸씩 앞으로 이동합니다.
		// 실질적으로는 없앨려고하는 index에 있는값을 해당 index뒤의 값으로 덮어씌움으로서 제거하고자 하는 값을 없앱니다.
		//ex. 10(index 0), 20(index 1), 30(index 2), 40(index 3)의 요소를 가지고 있는 ArrayList
		//객체가 있다고 가정합니다. index 1의 값을 제거하는 것을 목표로합니다.
		// 그렇다면 먼저 index2에 있는 30을 index1에 옮겨 덮어 씌웁니다.
		// index3의 값 30을 index2 으로 이동
		// 값을 옮기는 과정 아래와 같음
		/*
			elementData[1] = elementData[2];
			elementData[2] = elementData[3];
		*/
		// 위의 코드를 for을 통해 구현
		for(int i = index + 1; i <= size -1; i++) {
			elementData[i-1] = elementData[i];
		}
		
		//한요소가 없어졋기 때문에 size -1
		size--;
		
		//맨마지막 index는 아직 값이 남아 있으므로 null값을 저장
		elementData[size] = null;
		
		//삭제된 데이터를 반호나
		return removed;
	}
	
	
	/* 첫 요소 삭제 */
	public Object removeFirst() {
		//remove(int index)를 활용
		return remove(0);
	}
	
	
	/* 마지막 요소 삭제 */
	public Object removeLast() {
		//remove(int index)를 활용
		//맨마지막 요소 index는 size-1 입니다.따라서 size-1을 활용합니다.
		return remove(size-1);
	}

	
	/* 지정 index 요소 데이터 가져오기 */
	public Object get(int index) {
		return elementData[index];
	}
	
	
	/* size 가져오기 */
	public int size() {
		return size;
	}
	
	
	/* 데이터의 index 검색 */
	// 데이터가 존재시 해당 index반환
	// 데이터가 존재하지 않을 시 -1반환
	public int indexOf(Object o) {
		//객체 전체를 size 크기만큼 for을 도렬 탐색
		for(int i = 0; i < size; i++) {
			//찾고자 하는 데이터(o)와 해당 index의 데이터(elementData[i])가 일치시
			if(o.equals(elementData[i])) {
				//해당 index 값을 반환
				return i;
			}
		}
		
		// for을 돌려 탐색을 하였지만 일치하는 데이터를 찾지 못했을시 -1 int값을 반환
		return -1;
	}
	
	
	/* ArrayList 객체 Iterator객체로 변환 */
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	/* ListIterator Class */
	public class ListIterator{
		
		//Index 변수 0부터 시작
		private int nextIndex = 0;
		
		
		//다음 요소가 존재할 시에 true를 반환, 없을시 false를 반환
		//현재의 index는 변수 nextIndex
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		
		//다음 요소 데이터를 반환
		public Object next(){
			//nextIndex 자체가 다음의 Index기 대문에 해당 Index를 elementData[index]를 사용하여 데이터를 반환 후
			// index를 +1 진행
			return elementData[nextIndex++];
		}
		
		
		//앞의 요소가 존재할 시 true를 반환
		//현재의 index는 변수 nextIndex
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		
		
		//이전 요소 데이터를 반환
		public Object previous() {
			//앞의 요소데이터를 반환해야하기대문에 index에 먼저 -1을 해준 후 elementData[index]를 통해 데이터 반환
			return elementData[--nextIndex];
		}
		
		
		// next() 혹은 previous()에서 반환된 가장 마지막 요소  다음 요소에 데이터를 추가
		// 실제 ListIterator에서의 remove는 next(), previous() 둘다 가능한 메소드
		public void add(Object element) {
			//ArrayList에서 정의한 add(int index, Object element)를 사용
			//다음 Index인 nextIndex를 사용 후 +1을함
			ArrayList.this.add(nextIndex++, element);
		}
		
		
		// next() 에서 반환된 가장 마지막 요소를 제거 
		// 실제 ListIterator에서의 remove는 next(), previous() 둘다 가능한 메소드
		public void remove() {
			// next(), 메서드 실행 후 nextIndex가 다음 요소의 Index기 때문에 
			// 현재의 Index를 표현하기 위해 -1을 해줌
			ArrayList.this.remove(nextIndex-1);
			
			//다음의 index또한 한칸 앞으로 당겨졌기때문에 -1을 진행해줌
			// 예를들어보면 0, 1, 2, 3, 4의 index가 있습니다.
			// 현재의 ListIterator의 next()메소드를 통해 index1의 값이 반환이 된경우 nextIndex는 2일것입니다.
			// (nextIndex는 다음의 Index를 가리키는 변수 이기 때문입니다.)
			// 여기서 remove()를 사용하게되면 index1에 저장되어 있던 데이터가 없어지면서 index2의 값이 저장됩니다.
			// 다음의 Index값이 idnex2였지만 index1로 당겨져왔기 때문에 idnex또한 앞으로 이동하기 위해서 -1을 해줍니다.
			// 만약 이렇게 해주지 않을 경우 next()메소드를 진행시 index1로 당겨져온 값은 분명히 존재함에도 반환이 되지 못하기 때문입니다.
			nextIndex--;
		}
	}
	
}
