package chapter05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
		 자료형 : 변수를 선언시 변수에 할당할 값을 정의
		 	- 기본 자료형(8개):boolean, byte, shore, int , long, float, double, char
		 		- 메모리의 stack 공간에 변수와 값이 저장됨
		 	- 참조 자료형 : 배열, 열거, 클래스/인터페이스
		 		- 메모리의 stack 공간에 변수명과 참조주소(heap영역의 값의 번지수)
		 		-	변수에 들어갈 값은 heap영역에 저장
		 변수 - 변수에는 하나의 값만 저장됨.
		 	변수의 특징 : 초기 값을 할당 후 변수를 사용(아니면 오류)
		 	
		 배열 - 하나의 배열 변수에 많은 값을 저장 할 수 있다.
		 	배열의 특징 :1. 배열 변수의 동일한 자료형의 값만 저장 할 수 있다.ex)int는 int만
		 			  2. 배열은 방의 갯수가 정의 되면 수정이 불가능하다.
		 	 - 배열의 초기값을 할당하지 않더라도 강제로 초기값이 할당됨.
		 	 - heap 공간에는 값이 반드시 할당되어야 된다.
		 	 	ex)boolean (false값이 자동), 정수형 데이터(0), 실수형 데이터(0.0)
		 */
		
		System.out.println("========== 변수 ============");
		//1. 변수 - 선언과 동시에 값 할당
		int a = 10;
		
		//2. 변수 - 선언 이후 값 할당
		int b;		//선언
		b = 20;		//값 할당
		
		//변수를 선언 후 초기 값을 할당하지 않고 사용하면 오류발생
		int c ;
		int d ;
	//	int sum = c+d;		//오류! c,d 변수에 초기값을 넣지 않고 사용해서
		
		System.out.println("==========  배열: 1. 선언빙법 1 ==============");
		
		//1. 배열 선언 1.방법 <== 이방법을 주로 사용
		int[] array1 = new int[3];	//배열을 선언과 동시에 방의 크기를 바로 지정 
		//int[]->배열 선언 : 정수 값만 배열에 저장 가능
		//array1 : 배열 변수, 변수명은 stack 공간에 저장=array1의 번지수가 저장
		//new : heap 영역의 값을 저장하라
		//int[3] : heap 영역에 저장할 방의 갯수를 지정
		//			index : 방의 번호 0번부터 시작 0,1,2...ex)방3개 0,1,2
		
			//배열에 값 할당.
			array1[0] = 55;		//array1의 heap영역의 주소 0번째 방에 55를 넣어라
			array1[1] = 66;
			array1[2] = 77;
			
			//배열의 값 출력
			System.out.println("0 번째 방의 값 : " + array1[0]); //55
			System.out.println("1 번째 방의 값 : " + array1[1]); //66
			System.out.println("2 번째 방의 값 : " + array1[2]); //77
			
		int[] array2 ;	//배열 변수 선언
		array2 = new int[5];	//배열 변수에 들어갈 방의 갯수 지정
		
		//array2 배열 변수에 값을 넣고 출력
			array2[0] = 11;
			array2[1] = 22;
			array2[2] = 33;
			array2[3] = 44;
			array2[4] = 55;
			
			System.out.println("0번: "+array2[0]); //11
			System.out.println("1번: "+array2[1]); //22
			System.out.println("2번: "+array2[2]); //33
			System.out.println("3번: "+array2[3]); //44
			System.out.println("4번: "+array2[4]); //55
		
		System.out.println("========== 배열: 1. 선언빙법 2 ==============");
		
		//배열 선언과 방 크기 할당
		int array3[] = new int[4]; // index: 0,1,2,3
		
		//배열 방에 값 넣기
		array3[0] = 10;
		array3[1] = 20;
		array3[2] = 30;
		array3[3] = 40;
//		array3[4] = 50; index4번방은 없다 !오류 : 예외 발생
										 // - 컴파일 시 오류  : 이클립스에서 자동으로 오류를 출력 
										 // - 실행 시 오류 발생: 예외 처리 해줘야함
		
		//배열의 값을 출력하기
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
//		System.out.println(array3[4]); 오류발생 : 실행시 오류 발생
		
		//선언과 방 번호를 분리해서 정의
		int array4[];
		array4 = new int[5]; //array4[]는 오류발생
		
		
		System.out.println("========== 배열: 1. 선언빙법 3 ==============");
		
		//배열 선언과 동시에 값 할당
		int [] array5 = new int[] {10,20,30,40,50}; //<-이거도 많이 씀
		//방 크기를 지정하기 전에 값을 넣었다.
//		int [] array6 = new int[5] {10,20,30,40,50}; 
			//오류 발생 : 선언과 동시에 배열 변수에 값을 할당할때 방크기를 지정하면 오류발생
		
		//기존 방의 값을 수정
		array5[3] = 77; //기존 값 : 40
		
		System.out.println(array5[0]); //10
		System.out.println(array5[1]); //20
		System.out.println(array5[2]); //30
		System.out.println(array5[3]); //40 ->수정후 77
		System.out.println(array5[4]); //50
		
		//배열을 선언 후 값 할당.
		int[] array7 ; 
		array7 = new int[] { 100, 200, 300, 400, 500, 600 }; //<-이거도 잘씀
		
		System.out.println(array7[0]);
		System.out.println(array7[1]);
		System.out.println(array7[2]);
		System.out.println(array7[3]);
		System.out.println(array7[4]);
		System.out.println(array7[5]);
//		System.out.println(array7[6]); 오류발생
		
		System.out.println("========== 배열: 1. 선언빙법 4 ==============");
		
		//배열 선언과 동시에 값 할당 : 선언과 값 분리시 오류 발생
		int[] array8 = {11,22,33,44,55}; //new int[] 생략
		
		System.out.println(array8[0]);
		System.out.println(array8[1]);
		System.out.println(array8[2]);
		System.out.println(array8[3]);
		System.out.println(array8[4]);
		
		//선언과 값을 분리시 오류 발생
//		int [] array9;
//		array9 = {111,222,333,444,555};
		
		int [] array9;
		array9 = new int[]{111,222,333,444,555}; //값 앞에 new int[] 넣어줘야함
		
		
		
		
		
		
	}

}
