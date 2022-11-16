package chapter05.ex04;

import java.util.Scanner;

public class Ex01_2 {

	public static void main(String[] args) {
		// <문제>
		

		
			
		
		Scanner sc = new Scanner(System.in);
		int a; //선택문
		int i; //방크기
		
		do {
		
			
		System.out.println("=========================");
		System.out.println("1.인풋 값을 받아서 방의 크기 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 제외하고 저장후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기 지정하고 3의 배수만 저장하는데 그중 6의 배수는 빼고 출력");
		System.out.println("4.프로그램 종료");
		System.out.println("=========================");
		System.out.println("번호를 선택하세요>>");
		a = sc.nextInt();
		
		
		if (a == 1) {
			System.out.println("방의 갯수를 지정하세요");
			i = sc.nextInt();
			int[] arr1= new int[i];
			
			for (int x = 0, c = 1; x < arr1.length ; x++,c++) {
				if(c%7 == 0 || c%8 == 0) {
					arr1[x] = c; //x는 방 번호, c는 배수 값
					System.out.print(arr1[x]+" ");
				}
			}
		}else if(a==2) {
			System.out.println("방의 크기를 지정하세요");
			i = sc.nextInt();
			int[] arr2= new int[i];
			
			for (int x = 0, c = 1; x < arr2.length ; x++, c++ ) {
				if (c%4 != 0) {
					arr2[x]=c;
					System.out.print(arr2[x]+" ");
				}
			}
			
		}else if(a==3) {
			System.out.println("방의 크기를 지정하세요");
			i = sc.nextInt();
			int[] arr3= new int[i];
			
			for(int x = 0, c =3; x < arr3.length ; x++, c+=3) {
				if (c%6 != 0 ) {
					arr3[x]=c;
					System.out.print(arr3[x]+" ");
				}
			}
			
		}else if(a==4) {
			System.out.println("프로그램 종료");
			break;
		}else {
			
		}
		
		
		
		
		
		
		
		
		} while (true);
		
		
 sc.close();
	}

}
