package chapter14.ex01;

class Aa {}	//부모
class B extends Aa {} //자식

public class UncheckedException {

	public static void main(String[] args) {
		// 2. 실행 예외 : 컴파일 단계에서 체크하지 않는다. 실행시 예외가 발생
			//Unchecked Exception, RunTimeException
		
		//2 - 1. ArithmeticException : 정수를 0으로 나누었을때 발생하는 익셉션
			//모든 프로그램에서 숫자를 0으로 나누면 오류발생(자주발생)
		System.out.println( 3/0 );
		
		//2 - 2. ClassCastException : 다운 캔스팅스 타입이 존재하지 않는 경우 발생
		
		Aa a = new Aa(); //부모클래스 객체화
		B b = (B) a; //a객체는 B타입을 포함하지 않는다(타입객체 둘다 A)
		
		//2 - 3. ArrayIndexOutOfBoundsException : 배열의 방번호를 넘겼을때 발생하는 예외
		int[] arr = new int[] {1,2,3}; //0,1,2
		
		System.out.println(arr[3]); //배열의 방번호를 넘김
		
		//2 - 4. NumberFormatException : 문자 타입의 값을 정수, 실수로 변환할때
		int num = Integer.parseInt("10!"); //!가 있어서 변환불가
		double num2 = Double.parseDouble("10.22!"); //위와같음
		System.out.println(num2);
		
		// 제일 많이 발생되는 예외
		//2 - 5. NullPointException : 참조 주소의 값이 null인데, 메소드를 호출하는 경우
		String str = null;
		System.out.println(str.charAt(2)); //문자열이 저장된경우 index 2번방의 문자열을 출력하라
		
		
		

	}

}
