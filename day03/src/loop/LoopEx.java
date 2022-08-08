package loop;

public class LoopEx {
	public static void main(String[] args) {
//		반복문 예제

//		1. 7단의 구구단의 결과값만을 출력. 단 for 문으로 작성할것
				System.out.println("----------------------------");
				int for7 = 0 ;
				for(int i = 1; i < 10 ; i++) {
					for7 = i * 7;
					System.out.println(for7);
				}
//				2. 7단의 구구단의 결과값만을 출력. 단 while 문으로 작성할것
				System.out.println("----------------------------");
				int j = 1;
				int while7 = 0;
				while(j < 10) {
					while7 = j * 7;
					System.out.println(while7);
					j++;
				}
//				3. 7단의 구구단의 결과값만을 출력. 단 do ~ while 문으로 작성할것
				System.out.println("----------------------------");
				int n = 1;
				int while_do7 = 0;
				do {
					while_do7= n * 7;
					n++;
					System.out.println(while_do7);
				}while(n < 10);
//				4.1~100까지 중에 홀수와 , 짝수의 합을 각각 구하여라.
				System.out.println("----------------------------");
				int even = 0;
				int odd = 0;
				for(int i2= 1;i2 < 101;i2++) {
					if (i2%2 ==0) {
						even += i2;
					}else {
						odd += i2;
					}
				}
				System.out.println("짝수의 합: " + even);
				System.out.println("홀수의 합: " + odd);
				System.out.println("----------------------------");
//				5.2단 9단 까지의 결과값만을 출력하여라 (2중반복문)
//				단 , 단수가 바뀔때마다 구분자를 넣어줄 것 
				
				int result = 0;
				for(int i3 = 2; i3 < 10; i3++) {
					for (int j3 = 1; j3 < 10; j3++) {
						result = i3 * j3;
						System.out.println(result);
					}
					System.out.println("--------");
				}
				System.out.println("----------------------------");
//				6. 구구단 2단을 출력하자
				int result2 = 0;
				for(int i4 = 2; i4 == 2 ; i4++) {
					for(int j4 = 1; j4 <10 ; j4++) {
						result2 = i4 * j4;
						System.out.println(i4 +" * " + j4 + " = " + result2);
					}
				}
				System.out.println("----------------------------");
//			7.이중 반복문 ( 8 * 8)을 이용해서 출력
				for(int i5 = 1;i5 < 8 ; i5++) {
					for (int j5 = 1 ;j5 < 8;j5++) {
						System.out.print("★");
					}
					System.out.println("★");
				}
				System.out.println("----------------------------");
//			 
//			8.이중 반복문 ( 8 * 1)을 이용해서 출력
				
				for(int n1 = 1;n1 < 9 ; n1++) {
					for (int m = 0 ;m < n1;m++) {
						System.out.print("★");
					}
					System.out.println();
				}
				System.out.println("----------------------------");
//				역삼각형
//			9. 이중 반복문을 사용해서 별을 출력
				for(int k = 1;k < 9 ; k++) {
					for (int h = 9 ;h > k ;h--) {
						System.out.print("★");
					}
					System.out.println("");
				}
				System.out.println("----------------------------");

//				10. 10번찍어 안넘어가는 나무 없다 라는 문구를 출력
//				while 작성할 것, 
//				결과 : 나무를 1번 찍었습니다 ~ 나무를 10번 찍었습니다. 나무가 넘어갔습니다.
				int tree = 1;
				while (tree < 11) {
					System.out.println("나무를" + tree + "번 찍었습니다.");
					tree++;

				}
				System.out.println("나무가 넘어갔습니다.");
				System.out.println("----------------------------");
		
	}

}
