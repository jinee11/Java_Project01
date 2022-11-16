package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> <선생님 풀이>
		
		Scanner sc = new Scanner(System.in);
		// 배열을 인풋 받는 변수 선언
		int[] arr1;	//배열 변수 선언
		int n;		//선택지 변수 선언 (1,2,3,4...)
		int idx;	//배열의 방의 크기를 스캐너로 인풋 받는 변수 선언
		
		while(true) {
		
		System.out.println("=========================");
		System.out.println("1.인풋 값을 받아서 방의 크기 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 제외하고 저장후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기 지정하고 3의 배수만 저장하는데 그중 6의 배수는 빼고 출력");
		System.out.println("4.프로그램 종료");
		System.out.println("=========================");
		
		System.out.println("1 ~ 4번까지 번호를 선택하세요>>");
		n = sc.nextInt();
		
		if (n==1) {
			//1번을 선택시 출력하는 프로그램
			System.out.println("1번 선택 : 배열의 방의 크기를 넣어주세요>>");
			idx = sc.nextInt();		//배열의 방의 크기를 인풋받는 idx변수에 할당
			arr1 = new int[idx];	//arr1 배열 변수의 방의 크기를 지정
			
			//7의 배수와 8의 배수를 저장하는 프로그램 작성 : for 반복문을 사용해서 처리
			int i = 0; 	//배열의 방번호를 지정하는 변수<-for문안에서 선언하면 계속 루프?중간중간0이 출력됨
			int a;		//7, 8의 배수를 저장하는 변수
			
			for(a = 1; /*조건 생략*/ ; a++) { //! 조건을 생략하면 무한 루프
				if(a%7==0||a%8==0) {	//조건 : 7의 배수이거나 8의 배수라면 true
					arr1[i] = a;	//a에 저장된 7의 배수와 8의 배수를 i배열 방에 저장
					i++;		//배열의 방의 번호증가는 값이 저장될때만 증가되어야 됨(7,8의배수가 저장될때만)
				}
				if(i == idx) { //i==방번호, idx==인풋받은 방의 갯수
					break;			
				}
			}
			
//			System.out.println("인풋 받은 방의 갯수 : "+ idx);
//			System.out.println("마지막 방번호 : " + i);
//			System.out.println("마지막 방번호에 들어간 값 : "+a);
			
			//for문을 사용해서 배열(arr1)에 저장된 값을 출력
			System.out.println("1. 7의 배수, 8의 배수 출력...");
			for (i = 0/*0으로 다시 초기화*/; i < arr1.length ; i++) {
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
			
//			System.out.println("100 번방 값 출력 : "+arr1[100]);
			
		}else if (n==2) {
			//2번1
			System.out.println("2번 선택 : 배열의 방의 크기를 넣어주세요>");
			idx = sc.nextInt();
			arr1 = new int[idx];
			
			//for 문을 사용해서 1씩 증가하는데 4의 배수는 배열에 넣지 않고 저장
			int i =0 , a;
			for (a = 1; ; a++) {
				if(a%4==0) {
					continue;	//4의 배수가 되서 컨티뉴를 만나면 아래블락은 실행되지않아서 위 증가식으로 올라감
				}
				arr1[i] = a; 
				i++;
				if(i == idx) {
					break;
				}
			}
			
			//for문을 사용해서 배열에 들어간 값을 출력
			System.out.println("배열의 값 출력");
			for(i = 0; i <arr1.length; i++) {
				System.out.print(arr1[i]+" ");
			}
			
			System.out.println();
			
		}else if (n==3) {
			//3번
			System.out.println("3번 선택 : 배열의 방의 크기를 넣어주세요>");
			idx = sc.nextInt();
			arr1 = new int[idx];
			
			int i =0, a ;
			
			//for 문을 사용해서 값을 저장
			for (a=1; ; a++) {
				if (a%3==0) {			//3의 배수이고
					if (a%6!=0) {		//6의 배수가 아닐때
						arr1[i] = a;
						i++;
					}
				}
				if(i==idx) {
					break;
				}
			}
			
			//for 문을 사영해서 넣은 값을 출력
			System.out.println("배열의 내용을 출력");
			for (i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+" ");
			}
			
			System.out.println();
			
		}else if (n==4) {
			//4번
			System.out.println("4번 선택");
			break;
		}else {
			//위의 조건이 만족하지 않을때 : 1~4 이외의 값이 들어 왔을때
			System.out.println("1 ~ 4번 까지만 입력 해주세요");
		}
		
		} 
		
		System.out.println("프로그램이 종료되었습니다...");
		
		sc.close();
		
	}

}
