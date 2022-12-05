package chapter17.ex02;

//참고로 알아둘 내용. 몰라도 상관없으니 헷갈리지 말것.
//내부적인 메모리 공간 확보하는 방법들...하지만 컬렉션을 쓰니까 잘 안쓰는 방법들

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//java.lang 패키지 하위의 클래스는 생략이 가능 (Object, String, Integer...)


public class CeateListObject {

	public static void main(String[] args) {
		
		
		//1. ArraysList
		List<Integer> aList1 = new ArrayList(); //내부적으로 메모리 공간은 10개를 확보
		List<Integer> aList2 = new ArrayList(30); //내부적으로 초기메모리 공간 방 30개를 생성
		
		//2. Vector
		List<Integer> aList3 = new Vector(); //capacity(벡터의 메모리공간) 10확보
		List<Integer> aList4 = new Vector(50); //capacity 50확보
		
		//3.d LiskedList
		List<Integer> aList5 = new LinkedList(); //capacity 10
//		List<Integer> aList6 = new LinkedList(60); //!오류 방크기를 넣으면 안된다
												//초기 설정시 오류발생
		
		/*컬렉션은 자동으로 방크기가 늘어나고 줄어든다(무한정)
		   - Arrays.asList() 메소드를 사용해서 값을 넣을 경우 방크기가 고정되어버려서 늘어나거나 줄어들지 않는다
		     - 고정된 값만 들어가야할 경우 : 개월수, 요일 등
		*/
			List<Integer> aList7 = Arrays .asList(1,2,3,4,5,6,7,8,9,10,11,12);
			List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일");
			
//			aList7.add(13); //실행오류 UnsupportedOperationException
//							//값을 더 추가할 수 없다
//			aList7.remove(0); //실행 오류 값을 제거할 수 없다
			
			//수정은 가능하다. : .set()
			aList7.set(1, 7);
			
			try {
				aList8.add("오늘");
			}catch (UnsupportedOperationException e) {
				System.out.println("값을 추가할 수 없습니다");
			}
			
			try {
				aList8.remove(0);
			}catch (UnsupportedOperationException e) {
				System.out.println("방의 값을 제거할 수 없습니다");
			}
			
			aList8.set(0, "오늘");
			
			System.out.println(aList8);
		
	}

}
