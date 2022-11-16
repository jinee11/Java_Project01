package chapter03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자와 세가지 경우의 증감 연산자
		
		//1. 산술 연산자
		System.out.println( 2 + 3 ); //5    + : = 산술 연산자
		System.out.println( 2 + "3" ); //3을 문자로 인식    + 연결 연산자
		System.out.println(8-5); //3
		System.out.println(7*2); //14
		System.out.println(7/2); //3
		System.out.println(8%5); //3    %: 나누고 나서 나머지 값만 출력
		System.out.println(8%9); //8    
		
	System.out.println("===================")   ; 

		//2. 증감 연산자 (case 1)
		int value1 = 3;
		value1++; // ++ 1씩 증가
		System.out.println(value1); //4
		
		int value2 = 3;
		++value2;
		System.out.println(value2); //4
		
	System.out.println("===================")   ; 
		
		//3. 증감 연산자 (case 2)
		int value3 = 3;
		int value4 = value3++; //뒤에 ++는 value4에 나중에 적용(value3를 변수에 먼저 대입하고 ++은 나중에 
		                                          //그래서 출력하면 ++ 적용되지 않은 3이 뜨는거)
		System.out.println(value3); //4
		System.out.println(value4); //3
		
		int value5 =3;
		int value6 = ++value5;
		
		System.out.println(value5); //4
		System.out.println(value6); //4 (++가 먼저 증가시키고 대입)
		
	System.out.println("===================")   ; 
	
		//4. 증강 연산자의 사용 (case 3)
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;  //2 + 3 + 5 = 10
		                                       // 뒤에 --,++ 는 변수에 적용하기 전에 연산을 먼저하기 때문에
		
		System.out.println(value7); //2
		System.out.println(value8); //5
		System.out.println(value9); //10  value7의 --는 적용안됨
		
	System.out.println("===================")   ; 
		
		int value10 = 30;
		int value11 = 40;
		int value12 = 50;
		
		int value13 = 7 + --value10 + ++value11 + value12-- ;
		
		System.out.println(value10); //31
		System.out.println(value11); //41
		System.out.println(value12); //49 (뒤에 --는 변수에는 적용하지만)
		System.out.println(value13); //127 (연산에는 적용안됨)
		
		
		
		
		
		
		
		
		
		
	}

}
