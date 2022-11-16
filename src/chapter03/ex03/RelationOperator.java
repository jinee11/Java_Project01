package chapter03.ex03;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 연산VS등가 비교 연산자
		
		//1. 크기 비교 연산(< , > , <= , >=)  -> true, false
		System.out.println(5>2); //true
		System.out.println(5<2); //false
		
		System.out.println(5 >= 5); //true
		System.out.println(5 <= 5); //true
		
	System.out.println("=========================");
		
		//2. 등가 비교 연산자( == 같다 , != 같지않다 ) -> true, false
			//   ==   : 값이 같를때 true, 다으면 false
			//	 !=	  : 값이 다를대 true, 같으면 false
			//값이 같은지 다른지를 비교하는 연산자
			//stack 메모리의 값을 비교
			//stack 에 값이 저장되는 것은 기본 자료형 (이건 적용 잘됨)
			//참조 자료형일때 <- Heap 영역에 값이 저장, stack 영역에는 힙의 번지수가 들어가있음
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		
		System.out.println(a == c); //true
		System.out.println(a != c); //false
		
		System.out.println();
		
		//참조 자료형일때 <- (Heap 영역에 값이 저장, stack 영역에는 힙의 번지수가 들어가있음)
		
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		String str3 = new String ("잘가");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2); //false(제대로 적용 안됨)(스택의 힙에서 저장된 위치(번지수)를 비교하는 거기 때문에)
		//참조 영역에서 값을 비교할때 ? .equals() 메서드를 사용해서 값을 비교함
			//Heap 영역의 값을 비교 할때는 .equals()메서드
		
		//((개체변수1) .equals (개체변수2))
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //false
		
		
		
		
		

	}

}
