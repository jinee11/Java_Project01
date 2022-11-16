package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		// <문제> 2중 for문을 사용해서 1단에서 9단 출력 print출력 \t
		//	1단
		//	1 * 1 = 1    1 * 2 = 2	(tab로 구분해서 옆으로 나오게)
		//	공백
		//	2단
		//	2 * 1 = 2    2 * 2 = 4	(tab로 구분해서 옆으로 나오게)
		
		//나 
		System.out.println("========print=================");
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.println("\n" + i +" 단");
			for (int j = 1 ; j <=9 ; j++) {
				System.out.print(i + " * " + j + " = " + i*j+ "\t");
			}
			System.out.println();
			
		}
		
		//쌤
		for (int i = 1; i <10 ; i++) {
			//단을 출력하는 변수 : i
			System.out.println(i + " 단 출력");
			for ( int j = 1 ; j <10 ; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println();
			System.out.print("\n");
		}
		
		System.out.println("==========printf====================");
		//printf() 를 사용해서 출력부분을 간결하게 처리
		
		for (int i = 1; i <10 ; i++) {
			//단을 출력하는 변수 : i
			System.out.println(i + " 단 출력");
			for ( int j = 1 ; j <10 ; j++) {
				System.out.printf("%d * %d = %d \t",i,j,i*j);
			}
			System.out.println();
			System.out.print("\n");
		}
		
		
		
		

	}

}
