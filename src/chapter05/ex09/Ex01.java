package chapter05.ex09;

public class Ex01 {
		//<내풀이>
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
		int sum1 =0; //홍길동 점수
		int sum2 =0; //이 점수
		int sum3 =0; //김 점수
		int sum4 =0; //순 점수
		
		System.out.println("\t국어\t"+"영어\t"+"수학\t"+"과학\t"+"합계\t"+"평균\t");
		System.out.println("====================================================");
	
		//<이름별 점수>
		for(int i = 0; i < args.length; i++) {
			if(i==0) {
				System.out.print(args[i]+" ");
				for (i = 1 ; i < 5 ; i++) {
					sum1 += Integer.parseInt(args[i]);
					System.out.print("\t"+args[i]);
				}
				System.out.print("\t"+sum1+"\t"+sum1/4.0+"\n");
				System.out.println();
			}if(i==5) {
				System.out.print(args[i]+" ");
				for (i = 6 ; i < 10 ; i++) {
					sum2 += Integer.parseInt(args[i]);
					System.out.print("\t"+args[i]);
				}
				System.out.print("\t"+sum2+"\t"+sum2/4.0+"\n");
				System.out.println();
			}if(i==10) {
				System.out.print(args[i]+" ");
				for (i = 11 ; i < 15 ; i++) {
					sum3 += Integer.parseInt(args[i]);
					System.out.print("\t"+args[i]);
				}
				System.out.print("\t"+sum3+"\t"+sum3/4.0+"\n");
				System.out.println();
			}if(i==15) {
				System.out.print(args[i]+" ");
				for (i = 16 ; i < 20 ; i++) {
					sum4 += Integer.parseInt(args[i]);
					System.out.print("\t"+args[i]);
				}
				System.out.print("\t"+sum4+"\t"+sum4/4.0+"\n");
			}
			
		}
		System.out.println("====================================================");
		
		int asum1 = 0;//과목합계
		int asum2 = 0;
		int asum3 = 0;
		int asum4 = 0;
		
		int i1 =0;//과목병 방번호
		int i2 =0;
		int i3 =0;
		int i4 =0;
		//<과목별 점수>
		for (i1 = 1 ; i1 <args.length ; i1+=5) {
			asum1 += Integer.parseInt(args[i1]);
		}
		System.out.print("<합계>");
		System.out.print("\t"+asum1);
		for(i2 = 2 ; i2 <args.length ; i2+=5){
			asum2 += Integer.parseInt(args[i2]);
		}
		System.out.print("\t"+asum2);
		for(i3 = 3 ; i3 <args.length ; i3+=5) {
			asum3 += Integer.parseInt(args[i3]);
		}
		System.out.print("\t"+asum3);
		for(i4 = 4 ; i4 <args.length ; i4+=5) {
			asum4 += Integer.parseInt(args[i4]);
		}
		System.out.print("\t"+asum4);
		
		int sum;//합계 점수 총합
		sum = asum1+asum2+asum3+asum4;
		double avg =sum/4.0; //총 평균
		System.out.println("\t"+sum);
		
		System.out.print("<평균>");
		System.out.println("\t"+asum1/4.0+"\t"+asum2/4.0+"\t"+asum3/4.0+"\t"+asum4/4.0+"\t"+avg);

	}

}
