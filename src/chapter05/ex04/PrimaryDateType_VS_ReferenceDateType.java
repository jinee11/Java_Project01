package chapter05.ex04;

public class PrimaryDateType_VS_ReferenceDateType {

	public static void main(String[] args) {
		// 기본 데이터 타입과 참조 데이터 타입의 비교
		
		//1. 기본 데이터 타입에서 대입 연산( Stack 값을 복사)
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		
		System.out.println(value1); //3
		System.out.println(value2); //3 => 7
		
		System.out.println("====================");
		
		//2. 참조 데이터 타입에서 대입 연산( Stack 값(Heap의 주소)을 복사)
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;	//arr1의 srack값(heap 영역의 주소)를 복사
		arr2[0] = 7; //주소 값을 바꿔서 arr1의 주소도 같이 바뀐다(둘다 같은 영역의 주소값을 보기때문에)
		
		System.out.println(arr1[0]); //7
		System.out.println(arr2[0]); //7
		
		System.out.println("=======================");
		
		//객체의 Heap 영역의 주소 출력 : !String은 예외 사항 <== 객체를 출력하면 객체의 값이 출력
		System.out.println(arr1); //Heap 영역의 16진수의 Hash Code <== 메모리 주소값(stack에 저장된)
		System.out.println(arr2); //[I@74a10858 ^ 동일
		
		
		

	}

}
