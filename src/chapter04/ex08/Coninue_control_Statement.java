package chapter04.ex08;

public class Coninue_control_Statement {

	public static void main(String[] args) {
		// continue : 제어문 내에서 사용되는 break와 비슷하게 사용되는 키워드
		//		-- 반복문 내에서 continue를 만나면 continue 아래 실god 
		//		   블락을 실행하지 않고 증감식을 작동
		
		// 1. 단일 loop 에서 continue
		for (int i = 0; i <10 ; i++){ //증감식 ++만 적용
			continue ; //단독으로 쓰이는 경우는 거의 없다.
//			System.out.println(i); //오류! 작동안함, 도달할 수 없는 코드 블락
		}
		
		for (int i = 0; i<10 ; i++) {
			System.out.println(i + " ");
			continue; //이자리에 있는건 별로 의미없음
		}
		
		System.out.println("==============================");
		
		// continue 도 if 조건과 같이 일반적으로 사용됨
		
		for (int i =0; i<10 ; i++) {
			if (i==5) {
				continue; //5만 출력 안시키고 증감식으로 올라가서 다시 내려옴
			}
			System.out.print(i+" "); //=01234 6789
		}
		
		System.out.println("\n=====================");
		
		//2. 다중 loop 문에서 continue 
			// 2-1 단일 단계만 적용
		
		for ( int i =0; i<5 ; i ++) {
			for (int j= 0 ; j < 5; j++) {
				if(j==3) { //j가 3일때 컨티뉴밑의 내용을 실행하지
				continue; //않고 다시 올라와서 다음내용으로 넘어감
			}
			System.out.println(i+" , "+ j);
		}
		System.out.println();
		
		System.out.println("===============================");
		
			// 2-2 점프해서 이동 (LABLE을 사용)
		
		pos2: for ( int a = 0; a<5 ; a++) {
			for (int j =0; j<5; j++) {
				if (j ==2) {
					continue pos2 ; //j++로 가는게 아니라 a++로 간다(pos2: 위치로)
				}
				System.out.println(a+" , "+j);
			}
			System.out.println();
		}
		
		
		
		}

	}

}
