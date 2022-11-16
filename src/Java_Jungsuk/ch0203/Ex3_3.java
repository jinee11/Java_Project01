package Java_Jungsuk.ch0203;

public class Ex3_3 {

	public static void main(String[] args) {

//
//			 int numOfApples = 123; // 사과의 개수
//			 int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//			 int numOfBucket = (numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket > 0 ? 1:0)); // 모든 사과를 담는데 필요한 바구니의 수
//			 System.out.println("필요한 바구니의 수 :"+numOfBucket);// = 13
//		
//		
		
		
//		 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산자를 이용
//		 해서 (1)에 알맞은 코드를 넣으시오.
//		 Hint 삼항 연산자를 두 번 사용하라.
//
//		int num = 10;
//		  System.out.println(num > 0 ? "양수":(num < 0 ? "음수" : 0)  );
		
		
//		아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 ‘C =5/9 ×(F
//		- 32) ’라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점 셋째자리에서 반올림해야
//		한다.(Math.round( )를 사용하지 않고 처리할 것)
		
				 int fahrenheit = 100;
				 float celcius = (5/9f * (fahrenheit - 32));
//				 float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
				 System.out.println("Fahrenheit:"+fahrenheit);
				 System.out.printf("Celcius:%.2f",celcius);
		
		
		
		
		

	}

}
