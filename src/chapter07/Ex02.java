package chapter07;

class Student{
	//필드선언
	String stuName;	//학생이름
	int stuNum; //학번
	String stuAddr; //주소
	String stuPhone; //전화번호
	double weight; //몸무게
	
	//생성자 오버로딩,
	// 		기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student(){}
	
	Student(String stuName, int stuNum, String stuAddr){
		this.stuName=stuName;
		this.stuNum=stuNum;
		this.stuAddr=stuAddr;
	}
	
	Student(String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName=stuName;
		this.stuNum=stuNum;
		this.stuAddr=stuAddr;
		this.stuPhone=stuPhone;
		this.weight=weight;
	}
	//필드의 값을 출력하는 메소드 void print() {필드의 값을 출력}
	void print() {
		System.out.println("학생이름 : "+stuName);
		System.out.println("학번 : "+stuNum);
		System.out.println("주소 : "+stuAddr);
		System.out.println("전화번호 : "+stuPhone);
		System.out.println("몸무게 : "+weight);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// 객체
		Student st1 = new Student();
		st1.print();
		System.out.println("================");
		Student st2 = new Student("김밥",22,"종로구 낙원동");
		st2.print();
		System.out.println("================");
		Student st3 = new Student("치킨",10,"경남 거제시","055-055-055",50.5);
		st3.print();
		

	}

}
