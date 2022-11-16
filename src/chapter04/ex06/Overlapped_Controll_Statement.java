package chapter04.ex06;

public class Overlapped_Controll_Statement {

	public static void main(String[] args) {
		// 제어문의 중복
		
		System.out.println("======== if안의 if ===================");
		
		//1. if 구문 내의 if 구문
		
		int value1 = 5;
		int value2 = 3;
			//1번 if
		if (value1 > 4) {
			if (value2 < 2) { //2번 if
				System.out.println("실행1"); //1번이 true일때 실행 //2번이 true일때 실행
			}else {
				System.out.println("실행2"); //1번이 true일때 실행 //2번이 false일때 실행
			}
		}else {
			System.out.println("실행3"); //1번이 false일때 실행
		}
		
		System.out.println("========= switch안의 for문 ==================");
		
		//2. switch안의 for문
		
		int value3 = 2;
		
		switch (value3) { //value3값이 2므로 case2 선택
		case 1:
			for (int k = 0 ; k < 10 ; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			break;
		case 2 :
			for (int k = 10; k > 0 ; k--) { //k=10 0보다 커서 K--를 실행한다 0보다 큰수까지
				System.out.print(k + " ");
			}
			System.out.println();
			break;
		}
		
		System.out.println("========= for안의 for문 ==================");
//		
//		for (int i = 0 ; i < 3 ; i++); { 		//3번 루프, 0, 1, 2
//			System.out.println("i : " + i + "일때");
//			for (int j = 0 ; j < 5 ; j++); { //i가 1번 돌때 j는 5번 루프, 0,1,2,3,4
//				System.out.println(i + ", " + j);
//				
//				if (i == j) { 
//					System.out.println();
//					System.out.println("i == j"+i+" : "+j);
//					System.out.println();
//				}
//				
//			}
//			System.out.println();
//		}
//		

	}

}
