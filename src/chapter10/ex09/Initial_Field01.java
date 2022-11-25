package chapter10.ex09;

class Student {
	//필드
	String nama;
	int stuID;
	int age;
	String stuAdd;
	String stuPhone;
	double weight;
	int month; //1 ~ 12월 값이 들어와야함
	
	Student(){}
	Student(String name, int stuID, int age, String stuAdd, String stuPhone, double weight, int month) {
		//생성자에 올리는게 메모리에 올린다는 뜻
		this.nama = name;
		this.stuID = stuID;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		this.age = age;
		if(month >= 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.println("잘못된 입력값입니다. 정수 1 ~ 12 사이의 값을 할당하세요");
			return; //프로그램 종료
		}
	}
	
	//getter(필드의 값을 리턴으로 돌려줌), setter(인풋 값을 받아서 받은 값을 메모리(필드)에 할당) 생성
	public String getNama() { //메소드임 get+필드명
		return nama; //필드의 값을 리턴으로 돌려줌
	}
	public void setNama(String nama) {
		this.nama = nama; //name값을 인풋 받아서 필드에 할당
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.println("잘못된 입력값입니다. 정수 1 ~ 12 사이의 값을 할당하세요");
			return;
		}
		
	}
	
	//toString() 재정의 : 객체의 Heap 메모리의 주소값 출력, hashcode(16진수로 출력)
	//객체 자체를 출력했을때  toString()가 적용
	@Override
	public String toString() { //Object 클래스의 메소드, 모든 자바의 클래스는 Object 상속받도록 되있다
		return "Student [nama=" + nama + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + "]";
	}
	
}

public class Initial_Field01 {

	public static void main(String[] args) {
		// 1. 객체를 생성후 직접 필드에 값을 할당
		// 2. 객체를 생성할때 생성자를 사용해서 필드의 값을 할당.
		// 3. DTO(Data Transper Object), VO(Value Object) 
		//	- client 에게 값을 받아서 DAO에 값을 전송
				// DAO (Data Acess Object) : DataBase에 Insert, Update, Delete
		//	- getter(필드의 값을 읽을때), setter(필드의 값을 할당할때)를 사용
		
		//1. 객체를 생성 후 직접 필드의 값을 할당.(잘안씀)
		Student s1 = new Student();
		s1.nama = "홍길동";
		s1.age = 20;
		s1.stuAdd = "서울 종로구";
		s1.stuID = 1111;
		s1.stuPhone = "010-1111-1111";
		s1.weight = 80.5;
		s1.month = 50;
		
		System.out.println(s1); //toString() 메소드 호출(필드의 값(내용)을 출력...?)
		System.out.println(s1.toString());
		
		System.out.println("=====================");
		
		//2. 객체를 생성시 생성자를 통해서 필드의 값을 할당
		Student s2 = new Student("이순신", 2222, 30, "서울 광화문", "010-0000-0000", 80.5,11);
		
		System.out.println(s2); //출력은 거의 이렇게 한다
		System.out.println(s2.toString());
		
		System.out.println("=====================");
		
		//3. Setter를 사용해서 값을 넣고 getter를 사용해서 필드의 값을 출력
		Student s3 = new Student();
		
		s3.setNama("강감찬");
		s3.setAge(40);
		s3.setStuAdd("서울 성북구");
		s3.setStuID(3333);
		s3.setStuPhone("010-3333-3333");
		s3.setWeight(90.5);
		
		System.out.println(s3);
		System.out.println(s3.toString());
		
		System.out.println("====== getter 출력 =============");
		//getter 출력 : 필드의 값을 리턴으로 호출하는 곳으로 돌려줌
		//! 많이 씀
		System.out.println(s3.getNama());
		System.out.println(s3.getAge());
		System.out.println(s3.getStuAdd());
		System.out.println(s3.getStuID());
		System.out.println(s3.getStuPhone());
		System.out.println(s3.getWeight());
		
	}

}
