package chapter03.ex05;

public class AssigntOperator {

	public static void main(String[] args) {
		// 대입 연산자 (+=, -=, *=, /= ...)
		
		//1. 대입 연산자 축약 표현
		int value1 = 3;
		value1 = value1 + 3;  //value1 += 3(축약표현하면) //6
		System.out.println(value1); //6

	System.out.println("============================");
		
		//2. 축약 표현
		int value2 = 2;
		System.out.println(value2 += 2); //4 //value2 = value2 + 2
		System.out.println(value2 -= 2); //2 //value2(값4) = value2 - 2 (윗줄 연산값 적용)
		System.out.println(value2 *= 2); //4 //value2(값2) = value2 * 2
		System.out.println(value2 /= 2); //2 //value2(값4) = value2 / 2
		
		
		
		
		
		
		
	}

}
