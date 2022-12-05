package chapter12.ex02;

public interface Animal {
	
	//추상 메소드 ({구현부}가 없다)
	//public abstract가 생략되어 있다.
	void cry();
	void run();
	
//	void eat() {}; // 오류! 인터페이스 내부에 구현부가 있는 메소드를 넣으면 오류발생

}


//Animal의 메소드를 구현한 클래스
//Cat 클래스는 Animal 인터페이스의 구현되지 않는 메소드를 구현한 클래스
