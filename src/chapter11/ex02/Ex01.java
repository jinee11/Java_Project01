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
	
	//using Fields   //부모에서 유징필드해줘야 자식에서 매개변수 추가할수있다
	Student_Sub(String name, int kor, int eng, int math){
//		super(name); //아까 이게 안돼서ㅜ
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
		System.out.println(name + " " + kor + " " + eng + " " + math + " " + sum + " " + avg );

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
		
		Student[] arr = new Student_Sub[5];
		arr[0] = new Student_Sub("홍길동", 70, 88, 77);
		arr[1] = new Student_Sub("이순신", 80, 68, 87);
		arr[2] = new Student_Sub("김똘똘", 60, 86, 87);
		arr[3] = new Student_Sub("홍길순", 77, 56, 80);
		arr[4] = new Student_Sub("강감찬", 55, 66, 77);
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].sum_avg();
		}

	}

}
