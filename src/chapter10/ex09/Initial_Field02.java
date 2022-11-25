package chapter10.ex09;

class Student1 {
		//필드
		//접근 제어자가 private 일때 외부에서 필드를 접근불가
		//getter, setter 를 사용해서 접근이 가능
		private String nama;
		private int stuID;
		private int age;
		private String stuAdd;
		private String stuPhone;
		private double weight;
		private int month;
		
		//자식에게 상속할거면 기본생성자 만들어야함
		Student1(){}
		
		//Generate Constructor using Fields…
		public Student1(String nama, int stuID, int age, String stuAdd, String stuPhone, double weight, int month) {
			super(); //이건 제거(그냥 둬도됨 오브젝트 클래스에서 상복받았다는 뜻)
			this.nama = nama;
			this.stuID = stuID;
			this.age = age;
			this.stuAdd = stuAdd;
			this.stuPhone = stuPhone;
			this.weight = weight;
			this.month = month;
		}

		//getter, setter (public로 만들어야함)
		public String getNama() {
			return nama;
		}

		public void setNama(String nama) {
			this.nama = nama;
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
			this.month = month;
		}

		//객체 자체를 프린트 할때 필드의 값 전체를 출력할 수 있도록 
		//toString() 생성 : Object의 메소드
		@Override
		public String toString() {
			return "Student1 [nama=" + nama + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
					+ stuPhone + ", weight=" + weight + ", month=" + month + "]";
		}
		
}

public class Initial_Field02 {

	public static void main(String[] args) {
		// 1. 모든 필드의 접근제어자가 private 이므로 필드의 직접 접근이 불가
		// setter를 사용해서, 생성자를 사용해서 값을 할당 가능함
		Student1 s1 = new Student1();
		
		s1.setNama("세종대왕");
		s1.setAge(50);
		
		System.out.println(s1);
		

	}

}
