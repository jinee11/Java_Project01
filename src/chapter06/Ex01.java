package chapter06;

class Man {//여기선 객체 생성 안됨
	
	//필드
	String name = "홍길동";
	int age = 30;
	String phone = "010-1111-1234";
	String addr = "서울 종로 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : A() {}
	
	//메소드 :
	
	int i = 0;//방번호
	int j = 1;//배수
	
	
	void add1 () {
		int[] arr1 = new int[50];
		// 1 ~ 100까지 2의 배수를 출력하고 2의 배수를 더한 값을 출력
		for (j = 1; j<=100 ; j++) {
			if(j%2==0) {
				arr1[i] =j;
				i++;
			}
			if (j > 100) {
				break;
			}
		}
		for ( i =0 ; i < 50 ; i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}
	void add2 () {
		int[] arr1 = new int[500];
		// 1 ~ 500까지 3의 배수와 4의 배수를 출력하고 더한 값 출력
		for (i=0,j = 1; j <= arr1.length ; j++) {
			if(j%3==0||j%4==0) {
				arr1[i] =j;
				i++;
			}
			if(j>499) {
				break;
			}
		}
		for(i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	
	void add3 () {
		int[] arr1 = new int[1000];
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한 값 출력
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성 및 객체의 필드의 값이나 메소드 호출은 메인 메소드내에서만 가능
		
		Man add = new Man();
		
		add.add1();
		System.out.println();
		add.add2();
		

	}

}
