package chapter07.ex05;

class Student {
	//필드선언
	String stuName; //학생이름 : 학생이름없음
	int stuNo;		//학번 : 0
	String stuPhone;//폰번호 : 000-0000-0000
	String stuAddr; //주소 : 서울
	int stuAge;		//나이 : 0
	double stuWeight;//몸무게 : 0.0
	
	Student() {//기본생성자(초기값 할당) : this() 사용해서 각 필드의 값을 적용
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
	}
	
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr){
		this(stuName, stuNo,stuPhone);
		this.stuAddr = stuAddr;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge){
		this(stuName, stuNo,stuPhone,stuAddr);
		this.stuAge = stuAge;
	}
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge, double stuWeight){
		this(stuName, stuNo,stuPhone,stuAddr,stuAge);
		this.stuWeight = stuWeight;
	}
	
	void print() {
		//필드의 내용을 출력
		System.out.println("학생이름 : "+ stuName);
		System.out.println("학번 : "+ stuNo);
		System.out.println("폰번호 : "+ stuPhone);
		System.out.println("주소 : "+ stuAddr);
		System.out.println("나이 : "+ stuAge);
		System.out.println("몸무게 : "+ stuWeight);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== 기본값 ======");
		Student stu1 = new Student();
		stu1.print();
		
		System.out.println("==== 학생이름 ======");
		Student stu2 = new Student("김치찌개");
		stu2.print();
		
		System.out.println("== 학생이름,학번 ====");
		Student stu3 = new Student("김치찌개",2022);
		stu3.print();
		
		System.out.println("== 학생이름,학번,폰번호 ====");
		Student stu4 = new Student("김치찌개",2022,"010-7777-9999");
		stu4.print();
		
		System.out.println("== 학생이름,학번,폰번호,주소 ====");
		Student stu5 = new Student("김치찌개",2022,"010-7777-9999","서울시 종로구");
		stu5.print();
		
		System.out.println("== 학생이름,학번,폰번호,주소,나이 ====");
		Student stu6 = new Student("김치찌개",2022,"010-7777-9999","서울시 종로구",20);
		stu6.print();
		
		System.out.println("== 학생이름,학번,폰번호,주소,나이,몸무게 ====");
		Student stu7 = new Student("김치찌개",2022,"010-7777-9999","서울시 종로구",20,65.5);
		stu7.print();

	}
}
