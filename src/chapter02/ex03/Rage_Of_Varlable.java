package chapter02.ex03;

public class Rage_Of_Varlable {

	public static void main(String[] args) {
		// 변수의 사용범위 (변수의 생존기간) : 선언 위치에 따라서 생존 범위가 달라진다
		
		int value1 = 3;   //전역 변수
		
		{    // if, for, switch, do while,가 valu2자리에 쓰임
			int value2 =5;   //지역 변수
			System.out.println(value1);
			System.out.println(value2);
		}
		System.out.println(value1);
	//	System.out.println(value2); //오류발생 value2 (블락을 빠져나가서 소실발생)
		
		
		
		
	}

}
