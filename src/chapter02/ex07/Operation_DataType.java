package chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 VS 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5; // = 8
		int value2 = 8/5; // = 1 (정수라서 소수점버림)
		double value3 = 8/5; // = 1.0 (소수 값이 작아서 버림)
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		float data1 = 3.0f + 5.0f ; //= 8.0
		System.out.println(data1); 
		
		double data2 = 8.0 / 5.0;  //=1.6 
		System.out.println(data2); 
		
		double data3 = 8/5 ; //나눔 값인 정수가 더블 형으로 업캐스팅 =1.0
		System.out.println(data3); 
		
		double data4 = 8/5.0; //정수 8이 더블 형으로 업캐스팅 = 1.6
		System.out.println(data4); 
		
		//주의 : 평균을 계산 할때 double형으로
		
	System.out.println("==========================");
		
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅 후 연산)
	
	//	int data5 = 5 + 3.5; //오류발생 int 다운캐스팅은 수동으로 해야함(5가 더블로 업캐스팅 5.0 -> 결과값이 실수가됨) 
	
		double data6 = 5 + 3.5; // 5.0(더블로 업캐스팅) + 3.5 = 8.5
		System.out.println(data6);
		
		int data7 = 5 + (int) 3.5; // 5 + (인트로 다운캐스팅) 3 = 8
		System.out.println(data7);
		
		int data8 = (int) (5 + 3.5); // (5.0 더블로 업+3.5=8.5) 표시되는 결과값은 int로 8
		System.out.println(data8);
		
		double date9 = 5/2.0; // 5.0 더블형 업캐스팅 = 2.5
		System.out.println(date9);
		
		double data10 = 5/2; //정수로 계산후 출력 결과값이 더블형 = 2.0
		System.out.println(data10);
		
	System.out.println("==========================");
	
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) => data11(double)
		System.out.println(data11 + data12); //int 50이 더블로 업캐스팅 = 83.33
		
		//업캐스팅 : data11 (int) => data11(double)
		System.out.println(data11 / data12); //int 50이 더블로 업캐스팅 = 1.??(1.500정도)
		
		//다운캐스팅 : data12 (double) => data12 (int)
		System.out.println(data11 / (int)data12); //더블33.33이 인트로 다운캐스팅 정수+정수 = 1
		
		
	System.out.println("==========================");
		
	
		//<문제>
		//국어 : 90, 수학 : 88, 영어 : 77, 음악 : 90, 과학 : 99
		//각 과목의 점수를 정수(int)의 변수를 만들어서 저장 후 → 합계(sum), 평균(avg) 값을 출력
		//평균은 double 출력
	
		int a = 90; //국어
		int b = 88; //수학
		int c = 77; //영어
		int d = 90; //음악
		int e = 99; //과학
		
		//내가 야매로한거
		System.out.println((a + b + c + d + e) / (double) 5); //=88.8
		//쌤
		int sum = a + b + c + d + e;
		double avg = sum / 5.0 ; 
		
		System.out.println("합계는 : " + sum); //=합계는 : 444
		System.out.println("평균은 : " + avg); //=평균은 : 88.8
	
		
		
		
		

	}

}
