package chapter04.ex05;

public class Do_while_Statement {

	public static void main(String[] args) {
		// do ~ while 문 : 실행문을 조건과 상관없이 1번은 실행 시킨후 조건에 따라 반복
		//
		
		/* while 문 <=조건이 true일때만 실행
		 초기식;
		 while (조건) { 
		 	실행블락;
		 	증감식;
		 }
		 */
		
		/* do while 문 <=실행블락을 무조건 한번 실행시키고 조건에 따라 더 실행하거나 빠져나갈수 있다.
		 	초기식;
		 	do {
		 	    do실행블락;
		 	    증감식;
		 	} while (조건); 
		 */
		
		//1. while 문
		System.out.println("=== while 문==========");
		int a = 0;
		while (a < 0 ) {				//조건이 false이므로 실행블락이 실행되지 안됨
			System.out.println(a + " ");
		}
		
		System.out.println("=== do while 문==========");
		//2. do while 문
		a = 0;
		do {
			System.out.println(a + " ");//조건과 상관없이 1번 실행함 //0
		}while (a < 0); 				//false라서 빠져나옴

		
		//3. 반복 횟수가 10번인 경우 while문과 do while문 비교
		
		System.out.println("== while 문 을 사용해서 10번 출력 ==========");
		a = 0;
		while ( a < 10 ) {
			System.out.print(a + " "); // 0 1 2..9
			a++;
		}
		
		System.err.println("\n=== do while 문을 사용해서 10번 출력=======");
		a = 0;
		do {
			System.out.print(a + " "); // 0 1 2..9
			a++;
		}while (a < 10);
		
		
		
		
		
		
		
		
		
	}

}
