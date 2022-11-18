package chapter05.ex09;

public class Ex01_1 {
		//<쌤풀이>
	public static void main(String[] args) {
		/*
		 국어 영어 수학 과학     국어 영어 수학 과학		국어 영어 수학 과학		국어 영어 수학 과학
	홍길동 70  88  77  99 이순신 80  68  87 79  김똘똘 60  86 87 30  홍길순 77 56  80  99
		 
	메인 메소드 args로 아래와 같은 값이 인풋되었을 경우 <출력>과 같이 출력해보세요
	args: 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
			0	1  2  3  4   5   6  7  8  9  10   11 12 13 14  15  16 17 18 19	
	
	정수로 바꾸기
	
	<for문을 사용해서 출력하세요>(공백 하나씩만)
	
	<출력>
	
				국어		영어		수학		과학 		<합계>	<평균>
	===========================================================
	홍길동		70		88		77		99
	이순신		80		68		87		79
	김똘똘		60		86		87		30
	홍길순		77		56		80		99
	===========================================================
	<합계>
	<평균>
		 */
		
		//i=방번호
		System.out.println("=== STEP 1 : args 배열로 들어오는 모든 내용 출력 ====");
		for (int i = 0 ; i < args.length; i++) {
			System.out.print(args[i] + " "); //args[i]가 args[입력방크기]보다 작을때까지 반복
		}
		System.out.println();
		System.out.println();


		//step 2
		System.out.println("=====STEP 2  : 기본 출력 ========================");
		System.out.println();

		System.out.println("      국어       영어      수학     과학       <합계>      <평균>   ");
		System.out.println("================================================================");
		for (int i = 0 ; i < args.length; i++) {

			if (i % 5 == 0 ) { //5로 나누었을때 0일때 개행 , 0일때는 제외(이름 나올때마다 개행)
				if (i != 0) {
					System.out.println(); //국어~과학점수까지 출력
				}
			}

		System.out.print(args[i] + "\t");//과학 점수까지 나왔을때 다시 for로 돌아감
		// System.out.print(sum1  + "\t");

		}
		System.out.println();
		System.out.println("=================================================================");
		System.out.println("<합계> : ");
		System.out.println("<평균> : ");

		System.out.println();
		System.out.println();



		//step 3
		System.out.println("=====STEP 3  : 합계 / 평균 계산후 출력  ========================");
		System.out.println();

		//모두 for 문 밖에서 사용할수 있도록 변수 선언
		
		int sum1 =  0 ; //이름별 합계
		double avg1 = 1.0; //이름별 합계의 평균

		//아랫 라인의 합계 및 평균 변수 선언
		int korSum = 0 ; //국어 합계
		int engSum = 0 ; //영어  합계
		int mathSum = 0 ; //수학  합계
		int sienceSum = 0 ; //과학  합계

		double korAvg ; //국어 합계의 평균
		double engAvg = 1.0 ; //영어 합계의 평균
		double mathAvg = 1.0 ; //수학 합계의 평균
		double sienceAvg = 1.0 ; //과학 합계의 평균

		//allSum, allAvg
		int allSum = 0; //모든 점수 전체 합계
		double allAvg ; //전체 합계의 평균
		
		

		System.out.println("      국어       영어      수학     과학       <합계>      <평균>   ");
		System.out.println("================================================================");
		for (int i = 0 ; i < args.length; i++) { //for 블락시작

			if (i % 5 == 0 ) { //5로 나누었을때 0일때 개행 , 0일때는 제외
					if (i != 0) {
						System.out.println();
						}
				}

			//sum1, avg1 <<이름별 합계 loop>>
			if (i % 5 == 0) { //이름이 있는 index 제외일때만 루프돌게 하기
				sum1 = 0 ; //sum1 0으로 초기화 해줘야 합계,평균 찍고 if다음 이름으로 넘어감
			}
			if (i % 5 != 0) {
				sum1 += Integer.parseInt(args[i]); //이름 있는 index 아닐때만 인트로 전환
				//합이 모두 구해짐
			}
			//avg1 : 합이 모두 구해지면 평균 계산
			if (i == 4 || i == 9 || i == 14 || i ==19) {
				avg1 = sum1 / 4.0;
			}

			//출력
			System.out.print(args[i] + "\t"); 
			if (i == 4 || i == 9 || i == 14 || i ==19) { //방번호 4,9,14,19일때만 아래로 가서
				System.out.print(sum1  + "\t" + avg1); //sum1을 찍고 tab찍고 avg1 찍기
			}

			//마지막 라인에 라인 삽입
			if (i == args.length -1) { //i가 19번방까지 오면 아래 라인 찍기(홍길순 아래라인)
				System.out.println();
				System.out.println("=================================================================");
			}

			// 아랫 라인의 합계 및 평균 구하기 
			// (아직 for 블락 안 i(방번호) 0~19번까지 계속 돌아가는중)


			if (i == 1 || i == 6 || i== 11 || i == 16) { //국어합계
			korSum += Integer.parseInt(args[i]); //점수 String를 int로 바꿔서 저장
			}
			if (i == 2 || i == 7 || i == 12 || i == 17) { //영어합계
			engSum += Integer.parseInt(args[i]);
			}
			if (i == 3 || i == 8 || i == 13 || i == 18) { //수학합계
				mathSum += Integer.parseInt(args[i]);
			}
			if (i == 4 || i == 9 || i == 14 || i == 19) { //과학합계
				sienceSum += Integer.parseInt(args[i]);
			}

			//전체 합계 (allSum)
			if (i != 0 && i % 5 != 0 ) {
				allSum += Integer.parseInt(args[i]);
			}

		} //for블락 끝

		// 아래 라인에 합계 및 평균 출력
		korAvg = korSum / 4.0 ;
		engAvg = engSum / 4.0 ;
		mathAvg = mathSum / 4.0 ;
		sienceAvg = sienceSum / 4.0 ;

		allAvg = allSum / 16.0 ;

		System.out.print("<합계> : ");
		System.out.print(korSum + "\t" + engSum + "\t" + mathSum + "\t" + sienceSum + "\t" + allSum + "\t" + allAvg + "\n");
		System.out.print("<평균> : ");
		System.out.print(korAvg + "\t" + engAvg + "\t" + mathAvg + "\t" + sienceAvg + "\n");

		System.out.println();
		System.out.println();


	}

}
