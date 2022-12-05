package chapter17.ex03;

//리스트에 값 추가, 수정, 삭제 등 다양한 메소드()

import java.util.ArrayList; //ctrl + sthift + o 누르면 임포트됨
import java.util.Arrays;
import java.util.List;

public class ArrayList_Method {

	public static void main(String[] args) {
		
		
		List<Integer> aList1 = new ArrayList();
		
		//1. add (E element) : List에 값을 추가할때 : ArrayList, Vectory, LinkedList
			//마지막 방이 만들어지며 그 곳에 값을 넣는다
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		
		System.out.println(aList1); //[3, 4, 5]
		
		//2. add (int index, E element) : 특정 방번호에 값을 넣는다
		aList1.add(1, 6); //방번호 1번에 6값을 인풋하겠다
		System.out.println(aList1); //[3, 6, 4, 5]
		
		//3. addAll (다른 리스트객체)
		List<Integer> aList2 = new ArrayList();
		
		aList2.add(1); aList2.add(2);
		System.out.println(aList2); //[1, 2]
		
		aList2.addAll(aList1); //aList2뒤에 aList1이 붙는다
		System.out.println(aList2); //1,2,3,6,4,5
		
		//4. addAll (int index, 또 다른 리스트객체)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(2);
		System.out.println(aList3); //1(0),2(1)
		
		aList3.addAll(1, aList3); //1번방에 aList3부터 차례로 방에 값을 채우며 들어옴
		System.out.println(aList3); //1(0), 1(1), 2(2), 2(3)
		System.out.println(aList3.size()); //4 현재 총 방의 수
		
		//5. set(int index, E element) : 기존의 방의 값을 수정
		aList3.set(1, 5); 
		aList3.set(3, 6);
		System.out.println(aList3); //1,5,2,6
		
		//6. remove(int index) : 특정 방번호의 값을 삭제
		aList3.remove(1); //1번 방의 값을 삭제
		System.out.println(aList3); //1,2,6 1번 방 값이 삭제되며 방갯수가 줄어듬
		
		//7. remove(Object o) : 방의 들어간 값으로 값을 삭제(방도 자동으로 없어짐)
		aList3.remove(new Integer(2)); //오류x 경고, 앞으로 없어질 내용이다.
		System.out.println(aList3); //1,6 값 2 삭제
		
		//8. clear() : 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);// []
		
		//9. isEmpty() : 값이 없으면 - true, 존재하면 - false
		System.out.println(aList3.isEmpty()); //true
		
		//10. size() : 방의 갯수
		System.out.println(aList3.size()); //0
		aList3.add(1); aList3.add(2); aList3.add(3);
		System.out.println(aList3);//1,2,3
		System.out.println(aList3.size()); //3
		
		//11. get(int index) : 특정 방번호의 값을 가지고 올때 
		System.out.println("aList3 0번째 : " + aList3.get(0)); //0번째 : 1
		System.out.println("aList3 1번째 : " + aList3.get(1)); //1번째 : 2
		System.out.println("aList3 2번째 : " + aList3.get(2)); //2번째 : 3
		
		//12. toArray() : List ==> Array (리스트의 값을 배열로 변환)
		Object[] obj = aList3.toArray(); //오브젝트 타입의 배열 obj에 리스트의 값을 넣겠다
		
		System.out.println(Arrays.toString(obj)); // 1,2,3
		
		//13. toArray(T[] t) --> T[] : 리스트를 배열로 바꾸겠다.
		Integer[] int1 = aList3.toArray(new Integer[0]); 
		//0 : 변환할 배열방의 갯수인데, 들어올 컬렉션의 배열방보다 작게 설정된 경우 컬렉션 방 갯수와 맞춰서 처리
		//숫자가 컬렉션 배열방보다 클 경우 null값으로 빈 방들이 수에 맞춰 생긴다
		
		System.out.println(Arrays.toString(int1));//[1, 2, 3]
		
		//13-1
		Integer[] int2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(int2)); //[1, 2, 3, null, null]
		
		

	}

}
