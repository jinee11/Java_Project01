package chapter11.ex02;

import java.util.Arrays;

//<문제> 국영수 (상속,업캐스팅,다운캐스팅,객체를 배열에 넣어서 배열에 저장된 값을 출력
class Student {
	//필드
	String name;

	//합계와 평균을 구하는 메소드
	void sum_avg () {
	}
}

class Student_Sub extends Student {
	//자식 필드
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	
	Student_Sub(){}
	public Student_Sub(String name, int kor, int eng, int math) {
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//부모의 sum_avg() 오버라이딩해서 객체의 kor,eng,math의 합계와 평균을 출력하는 메소드
	@Override
	void sum_avg () {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.printf("학생 %s의 총 점수 합계는 %d이고 평균은 %4.2f입니다");
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 
		//생성자를 사용해서 객체 생성시 필드의 값을 할당하고
		/*     국 영 수
		 홍길동 70 88 77
		 이순신 80 68 87
		 김똘똘 60 86 87
		 홍길순 77 56 80
		 강감찬 55 66 77
		 */
		
		//Student 배열변수 arr 변수에 모든 객체를 저장해서(업캐스팅) 방5개(학생수)
		
		//배열의 값을 for문으로 출력할때 
			//오버라이딩된 메소드 출력 <- 그 학생의 각 과목 점수 나열, 합계, 평균
			//5명의 각 과목에 대한 점수 합계, 평균 출력(다운캐스팅)
		
		Student s1 = new Student_Sub("홍길동",70,88,77);
		Student s2 = new Student_Sub("이순신",80,68,87);
		Student s3 = new Student_Sub("김똘똘",60,86,87);
		Student s4 = new Student_Sub("홍길순",77,56,80);
		Student s5 = new Student_Sub("강감찬",55,66,77);
		
		Student[] arr = new Student[] {s1,s2,s3,s4,s5};
		
		//각 학생의 합계 및 평균
		int []sum = new int[3]; //sum[0] : 국어합계, sum[1] 영어합계, sum[2] 수학합계를 담을거임
		for (int i = 0 ; i < arr.length ; i++) {
			
			//각 학생의 합계 및 평균을 !오버라이딩된 메소드로 호출
			arr[i].sum_avg();
			
			sum[0] += ((Student_Sub)arr[i]).kor;//Student arr을 Sub로 다운캐스팅해야 kor접근가능
			//arr[i]방에 kor 필드가 뜰때마다 sum[0]방에 저장하라
			
			sum[1] += ((Student_Sub)arr[i]).eng;
			sum[2] += ((Student_Sub)arr[i]).math;
			
			if( i == arr.length-1 ) {
			//i = 0부터 시작하는 숫자와 arr.방숫자(1부터 시작)-1(0부터시작) 이 동일할때 실행하라
			//왜? index 0,1,2에 합계 점수가 담겨 있고 int i는 0부터 선언하고 arr[i]로 방번호로 썼고 
			//방에 담긴 함계를 그걸 출력하기 위해서
				System.out.println("======================");
				System.out.printf("5명의 국어 점수 합은 %d 이고 평균은 %4.2f 입니다",sum[0], sum[0]/5.0);
				System.out.println();
				System.out.printf("5명의 영어 점수 합은 %d 이고 평균은 %4.2f 입니다",sum[1], sum[1]/5.0);
				System.out.println();
				System.out.printf("5명의 수학 점수 합은 %d 이고 평균은 %4.2f 입니다",sum[2], sum[2]/5.0);
				
			}
			
		}
		
		
	

	}

}
