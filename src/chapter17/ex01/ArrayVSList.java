package chapter17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*배열과 컬렉션의 차이점
	1. 배열 : 
		- 동일한 타입을 저장
		- 방의 크기가 고정 : 방의 크기를 수정이 불가능하다
	2. 컬렉션 :
		- 동일한 타입을 저장
		- 모든 컬렉션은 제너릭 타입으로 지정이 되어있고 객체를 생성시에 타입을 지정해서 저장할 수 있다.
		- 방의 크기가 고정되어있지 않다. 자동으로 늘어나고 자동으로 줄어든다
*/
public class ArrayVSList {

	public static void main(String[] args) {
		//1-1. 배열
		String[] arr = new String[] {"가","나","다","라","마","바","사"};
			//배열 방의 크기 출력
		System.out.println(arr.length); //7
			//배열의 방의 값을 삭제시 자동으로 방의 크기가 줄어들지 않는다. 그냥 비어있다.
		arr[2] = null;
		arr[5] = null;
		
			//배열의 값을 출력
		System.out.println(Arrays.toString(arr));//[가, 나, null, 라, 마, null, 사]
		System.out.println(arr.length); //7
		
		System.out.println("=========================");
		//2-1. 컬렉션 (List) <== arrayList
		
		//! List : 인터페이스, 타입으로 지정은 가능하나 객체화 할수는 없다
			//ArrayList<>, Vector<>, LinkedList<> 구현체로 List를 타입으로 둘 수 있다.
		List<String> aList = new ArrayList<>(); //import해야한다
		
		//List의 방의 크기를 알려주는 메소드 : 객체명.size()
		System.out.println(aList.size()); //0
		
		//List에 값 넣기 : .add()
		aList.add("가"); aList.add("나"); aList.add("다"); aList.add("라"); 
		aList.add("마"); aList.add("바"); aList.add("사");
		
		System.out.println(aList.size()); //7
		
		aList.add("아");
		
		System.out.println(aList.size()); //8 
		
		//List 방의 값을 출력하기
		 //모든 컬렉션은 객체 자체를 출력시 Object 클래스의 toString() 재정의 되어있다.
		 //배열과 달리 바로 출력해도 해쉬코드로 안나온다는 말
		System.out.println(aList); //[가, 나, 다, 라, 마, 바, 사, 아]
		
		//컬렉션 값을 삭제 : .remove()
		aList.remove("다");
		aList.remove(0);
		aList.remove(0);
		
		System.out.println(aList); //[라, 마, 바, 사, 아]
		
		
	}

}
