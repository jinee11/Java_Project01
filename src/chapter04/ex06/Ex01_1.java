package chapter04.ex06;

import java.util.Scanner;

public class Ex01_1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		do {
		
		System.out.println("========================================");
		System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단중 7배수 단만 출력 | 4. 프로그램 종료");
		System.out.println("========================================");
		System.out.println(" 위 번호를 선택하세요 >>>");
		i = sc.nextInt();
		
		if (i==1) {
			System.out.println("1구구단");
			for(int a = 1 ; a<= 9 ; a++) {
				System.out.println(a +"단");
				for (int j = 1 ; j<=9 ; j++)
					System.out.printf("%d * %d = %d\t",a,j,a*j);
				System.out.println();
			}
		}else if (i==2) {
			System.out.println("2 19단");
			for(int a = 1 ; a <=19 ; a++) {
				System.out.println(a+"단");
				for (int j =1 ; j <= 19 ; j++)
					System.out.printf("%d * %d = %d\t",a,j,a*j);
				System.out.println();
			}
		}else if (i==3) {
			System.out.println("3 4배수");
			for (int a=4 ; a <=19 ; a +=4) {
				System.out.println(a+"단");
				for (int j=1 ; j<=19 ; j++)
					System.out.printf("%d * %d = %d\t",a,j,a*j);
				System.out.println();
			}
		}else if (i==4) {
			System.out.println("4 종료");
			break;
		}else {
			System.out.println("다시");
		}
		
		} while (true);
		sc.close();
	}

}
