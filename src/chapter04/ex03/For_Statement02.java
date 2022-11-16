package chapter04.ex03;

public class For_Statement02 {

	public static void main(String[] args) {
		// 2. FOR 문의 특수한 형태 (무한 루프)
		//		--- for 문에서 조건이 생략될 경우 무한루프
		//		-- 초기식, 조건, 증감식이 모두 빠진 경우도 무한루프
		/*
		for (int i = 0 ; ; i++) {			//조건이 생략되면 무한루프 !메모리가 풀 : 서버 다운
			System.out.println(i+" "); //0 1 2...무한
		}
		*/
		/*
		for (;;) { <=초기식,조건,증감식 모두 생략
			System.out.println("무한루프");
		}
		*/
		
		System.out.println("==========================");
		//무한루프 탈출 : break;
		for (int i = 0 ; ; i++) {
			System.out.println(i+" "); //1 2 3.. 101
			if (i > 100) { //i가 100보다 크면 true가 되서 break
				break; //break;는 if 조건과 같이 사용한다.
			}
		}
		

	}

}
