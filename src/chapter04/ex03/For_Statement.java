package chapter04.ex03;

public class For_Statement {

	public static void main(String[] args) {
		// For 문 : 조건이 true 동안 실행블락을 반복해서 처리, 조건이 false 리면 for 문을 빠져나온다.
		/*
		   for (초기값;조건;증갑식) {
		  		실행블락		//조건이 true일동안 반복, 조건이 false면 빠져나온다.
		    }
		 
		 */
			// 1. for 문의 기본 구조 (println)
			int a;				//변수를 블락 밖에서 선언 : 전역변수 ->메인메소드내에서 사용됨
			for (a=0 ; a < 3 ; a ++) { //ture라서 증감식을 실행한다.
				System.out.println(a); //0,1,2 //3보다 작은수까지 증감식을 실행한다
				                       //(3이되면 조건이 false가 되므로 빠져나온다)
			}

			System.out.println("=============================");
			                    //(print)
			for (int b = 0 ; b < 100 ; b+=2) { //변수 b : 지역변수 ->for블락내에서만 사용됨
				System.out.print(b + " "); //true = 0 2 4 6 ...98 //프린트라서 엔터가 없고 "공백"
											//을 넣어서 숫자사이에 공백
			}
			
			System.out.println();
			System.out.println("============================");
			
			//int = a; 전역변수 위에서 선언했으므로 다시 선언 불가능
			for ( a = 0; a < 20 ; a += 3) {
				System.out.print( a + " "); //0 3 6 9 12 15 18
			}
			
			System.out.println();
			System.out.println("=============================");
			
			//int = b; 지역변수 for블락을 벗어나서 재선언 가능
			for (int b = 0 ; b < 20 ; b += 4) {
				System.out.print(b + " "); //0 4 8 12 16
			}
			
			System.out.println();
			System.out.println("================================");
			
			//초기값 100 부터 1씩 빼면서 조건은 0보다 클때까지 (i>0)
			for (int i = 100 ; i > 0 ; i--) {
				System.out.print(i + " "); //100 99 98...1
			}
			
			System.out.println();
			System.out.println("==========================");
			
			for (int i = 1000 ; 0 < i ; i -= 3) {
				System.out.print(i+" "); //1000 997 994...1
			}
			
			System.out.println();
			System.out.println("====================================");
			
			//여러개의 변수를 초기식 및 증감식에서 처리 가능
			for (int i = 0 , j = 0 ; i < 100 ; i++, j++) {
				System.out.println(i + ", " + j); //0, 0 / 1, 1 / 2, 2 / ...  / 99, 99 /
			}
			
			System.out.println("============================");

			
	}

}
