package chapter05.ex02;

public class Ex01_1 {

	public static void main(String[] args) {
		// <문제> arr1 배열변수에 정수 1000개의 방을 생성
		//	for문을 사용해서 각 방에 3의 배수의의 값을 저장
		//	for문을 사용해서 각 방의 내용을 출력
		//선생님 버전...내꺼는 틀렸다 끝수가 2997이다
		
		int[] arr1 = new int[1000];
		
		for (int i = 0, j = 3; i <1000; i++, j+=3) {
			arr1[i] = j;
		}
		for (int i = 0 ; i <1000 ; i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
