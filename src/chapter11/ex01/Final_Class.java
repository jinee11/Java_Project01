package chapter11.ex01;

class Aaa {
	int m;
	final int n; //값을 할당하지 않은 상태면 오류 발생함
	
	Aaa(){ //기본생성자에도 상수 값를 넣어줘야한다...왜,,,?
			//물어봄!! 값을 할당하지 않으면 오류가 생기니까! 글케 이해하자
		n = 10;
	}
	Aaa(int n){
		this.n = n;
	}
	
	void run () {
		System.out.println("Aaa클래스의 run()");
	}
	
}

final class Bbb extends Aaa { //오류발생! 부모의 기본생성자가 없어서<-생성 완료
//Bbb는 상속이 불가하도록 설정된 클래스
	
}

//class Ccc extends Bbb { //상속불가 : 부모클래스의 이름에 final 키가 할당되서
//}

public class Final_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
