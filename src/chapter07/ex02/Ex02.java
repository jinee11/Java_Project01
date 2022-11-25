package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 두 배열의 각 방의 내용을 더해서 출력하는 메소드 생성
		
		//배열 a : 4의 배수를 1 ~ 300 까지 (방번호가 아니라 숫자)
		int[] a = new int[300/4];
		for(int i = 0, j = 4; i < a.length ; i++,j+=4) {
			a[i]=j;
		}
		System.out.println("======4의 배수 출력====");
		for(int i = 0; i < a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//배열 b : 5의 배수를 1 ~ 300 까지
		int[] b = new int[300/5];
		for(int i = 0, j = 5; i < b.length ; i++,j+=5) {
			b[i]=j;
		}
		System.out.println("======5의 배수 출력====");
		for(int i = 0; i < b.length ; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n===index 59 번째 방의 내용 출력 ");
		System.out.println(a[59]);
		System.out.println(b[59]);
		
		System.out.println("=======각방의 값을 더해서 출력=======");
		//두 배열의 각 방의 값을 더해서 출력
		Ex02.addArray(a, b);

		System.out.println("\n=======쌤꺼 각방의 값을 더해서 출력=======");
		Ex02.arraySum(a, b);
	}
	//두개의 배열을 인풋 받아서 각방의 값을 더해서 출력(4의배수 0번방+5의배수 0번방)방의 갯수 안맞음 남는 값은 0으로 출력
	public static void addArray(int[] a, int[] b){
		for (int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < b.length; j++,i++) {
				System.out.print(a[i]+b[j]+" ");
			}
		}
	}
	//쌤
	public static void arraySum (int[] a, int[] b) {
		int[] c = new int[75];
		for (int i =0; i < a.length; i++) {
			for (int j = 0 ; j < b.length; j++) {
				if (i > 59) {
					c[i] = a[i] + 0;
				}
				if(i == j) {
					c[i] = a[i] + b[j];
				}
			}
		}
	}
	

}
