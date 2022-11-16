package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// While 문 : 반복문 , 조건이 true 동안 반복, 조건이 false 면 실행블락을 빠져나온다.
		/*
		 	for (초기식; 조건 ; 증감식){
		 	실행블락;
		 	}
		 	
		 */
		
		
		
		/*
		 
		 초기값
		 while (조건) {
		 	실행블락;
		 	증감식;
		 }
		 
		 */
		System.out.println("=== While 문으로 출력 ==========");
		//1. while 문의 기본 문법 구조 (증감식을 처리하지 않으면 무한루프)
		int a =0; //초기값
		while (a < 10) { //조건
			System.out.print(a + " "); //0 1 2 3...9 //실행블락
			a++; //증감식
		}
		
		System.out.println("\n=== For 문으로 출력 ==========");
		//2. For 문으로 변환
		for (a = 0 ; a < 10 ; a++) {
			System.out.print(a+ " ");
		}
		
		System.out.println("\n======= while 문 ==============");
		
		//while 문 VS for 문으로 처리 : 100 부터 1까지 2씩감소해서 출력
		
		a = 100;
		while (a > 1) {
			System.out.print(a +" "); // 100 98 96...2
			a -=2;
		}
		
		System.out.println("\n===== for 문 ================");
		
		for ( a = 100 ; a > 1 ; a -=2) {
			System.out.print(a + " "); // 100 98 96...2
		}
		
		System.out.println("\n======= whlie 에서 무한루프 ==============");
		
		boolean ab = true;
		int d = 0;			//기본자료형은 반드시 초기값이 할당되어 있어야한다.(참조는 자동으로 들어감)
		while (ab) { //항상 조건이 true라서 무한루프
			System.out.println(" 무한루프 "); //무한루프 무한루프... 101번 나오고  탈출
			
			if ( d > 100 ) { //d가 100보다 커지면 무한루프 탈출//if조건
				break;
			}
			d++; //증감식
		}
		System.out.println(" while 문 빠져나옴 ");
		
		

	}

}
