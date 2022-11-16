package chapter03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 : if ~ else(if의 else) 구문을 축약해서 사용할때
			// (조건) ? 참:거짓;  (조건) 참이면 ? 뒤의 <<참>>실행, (조건) 거짓이면 ? <<거짓>>실행
		
		int value1 = ( 3 > 5 ) ? 6 : 9; //조건이(3>5)false라서 ? 6:9 뒤의 값인 9가 value1에 들어감
		
		System.out.println(value1); //9
		
		int value2 = (3<5) ? 6:9; //조건이 true라서 6
		
		System.out.println(value2); //6
	
		
		
		

	}

}
