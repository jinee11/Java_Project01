package chapter07.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매개 변수로 배열을 Argument로 인풋
		
			//주의 100번 방까지가 아니라 3의 배수가 100번까지 나오는것
		//1 ~ 100 까지 3의 배수의 배열을 생성후 (매개변수2개) 메소드 호출 , 정수를 던지면 그 수만큼 곱해서 출력: 정수 5호출
		//1. 3의 배수 배열 생성 2. 정수 5호출(곱할것)
		//3의 배수 배열 생성
		int[] a = new int[100/3]; //3의 배수가 100번방이 아닌 번호 100까지 나오게 하기 위해 방번호/3
		for(int i=0,j=3; i < a.length ; i++, j+=3) {
			a[i] = j;
		}
		//3의 배수 출력
		System.out.println("=== 3의 배수 출력 ======");
		System.out.println("방의 갯수 : "+a.length);
		for (int i = 0; i<a.length ;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n====== 3의 배수 배열에 각 방에 값을 * 5 =================");
		Ex01.printArray(a, 5);
		
		//1 ~ 100 까지 7의 배수 배열 생성후, 정수: 2
		//7배수 배열 생성 - 정수 2호출
		System.out.println("========7의배수==========");
		int[] a1 = new int[100/7];
		for (int i = 0, j = 7; i <a1.length ; i++,j+=7) {
			a1[i]=j;
		}
		for (int i =0 ; i<a1.length ; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println("\n======= 7의 배수 * 2 ========");
		Ex01.printArray(a1, 2);
	}
	
	//메소드 1개 : static, 매개변수로 정수1,배열1 인풋받아서 //정수2개로 해보기
	//	각 방에 배열의 값을 인풋 받은 정수로 곱해서 출력하는 배열
	//a 인풋받을 곱할 정수			//a=3or7 배수인풋(배열인풋) b=곱하기 정수
	public static void printArray( int[] a, int b) {
		for(int i = 0; i < a.length ; i++) {
			System.out.print(a[i] * b + " ");
		}
		System.out.println();
	}
	
//	public static int[] mulitArray (int maxCount, int multi) {
//		int[] a = new int[maxCount/multi];
//		for (int i = 0, j = 1 ; i < a.length ;j++) {
//			if(j% multi ==0) {
//				a[i]=j;
//				i++;
//			}
//		}
//	}

}
