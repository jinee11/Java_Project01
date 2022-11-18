package chapter05.ex04;

import java.util.Scanner;

public class Ex01_2 {

	public static void main(String[] args) {
		// <문제>
		Scanner sc = new Scanner(System.in);
		
		int[] arr1; //배열변수
		int n ;//선택지
		int idx;//방크기
		
		while (true) {
		
		System.out.println("=========================");
		System.out.println("1.인풋 값을 받아서 방의 크기 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 제외하고 저장후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기 지정하고 3의 배수만 저장하는데 그중 6의 배수는 빼고 출력");
		System.out.println("4.프로그램 종료");
		System.out.println("=========================");
		
		System.out.println("번호를 선택하세요");
		n = sc.nextInt();
		
		if(n==1) {
			System.out.println("방 크기를 지정하세요");
			idx = sc.nextInt();
			arr1 = new int[idx];
			
			int i=0 ;//방번호
			int j ;//배수
			
			for (j=1; ;j++) {
				if(j%7==0||j%8==0) {
					arr1[i]=j;
					i++;
				}
				if (i==idx) {
					break;
				}
			}
			for (i = 0; i < arr1.length ; i++) {
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
		}
		
		if(n==2) {
			System.out.println("방크기를 지정하세요");
			idx = sc.nextInt();
			
			arr1 = new int[idx];
			int i =0;
			int j = 1;
			for(i = 0 ; ; i++) {
				if(j%4==0) {
					continue;
				}
				arr1[i]=j;
				i++;
				if(i==idx) {
					break;
				}
			}
			for(i=0; i< arr1.length ; i++) {
				System.out.println(arr1[i]+" ");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
