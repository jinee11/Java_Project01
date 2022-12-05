package chapter16.ex04;

//제너릭 클래스 : 타입변수가 2개인 제너릭 클래스 <K,V>
class KeyValue<K,V> { //1-1
	
	//1-2 필드 선언하고 getter,setter
	private K key;
	private V value;
	
	//getter(필드의 값을 호출),setter(필드의 값을 입력)
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class TwoGeneric_Arguments {

	public static void main(String[] args) {
		// 1-3 <String, Intiger> 타입으로 객체생성
		KeyValue <String, Integer> kv1 = new KeyValue<>();
		
		//1-4 setter 사용해서 값 인풋
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		//1-5 getter 사용해서 값 출력
		String key1 = kv1.getKey(); //이건 출력하기 편하게 변수에 담은것 안담고 바로 출력해도됨
		Integer val1 = kv1.getValue();
		
		System.out.println("key : " + key1 + " value : " + val1);
		
		System.out.println(kv1.getKey() + "," + kv1.getValue());
		
		System.out.println("=====================");
		
		// 1-3 <Inter,String>
		KeyValue<Integer,String> kv2 = new KeyValue<>();
		
		//setter
		kv2.setKey(404);
		kv2.setValue("NotFound : 요청한 페이지를 찾지 못했습니다.");
		
		//getter
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		// 1-3 <String, Void> <== void를 넣는 이유 : 헤당 필드를 사용하지 않겠다(String는 사용함)
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("key 값만 사용"); //
		System.out.println(kv3.getKey());
		
		
		
		

	}

}
