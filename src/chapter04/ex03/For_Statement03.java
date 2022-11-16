package chapter04.ex03;

public class For_Statement03 {

	public static void main(String[] args) {
		// 3. for 문 내의 for문 : 2중 for 문
		// for 문을 사용해서 구구단 출력 
		
		// 바깥쪽 for문은 단을 출력하는 변수
		// i * j = i*j
		for (int i = 1 ; i < 10 ; i++) {
			
			// 안쪽 for문은 i단 결과(?)를 출력하는 변수
			System.out.println(i + "단 출력 ");
			for (int  j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			} //j가 9가되면 빠져나가서 다시 i for문으로 그걸 i for문 9가 될때까지 반복
			
			System.out.println();
			
			
		}
		
		
		

	}

}
