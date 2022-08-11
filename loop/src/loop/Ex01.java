package loop;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		피라미드 별찍기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();		 //피라미드 줄 수 입력받기
		
		for(int i = 0; i < num ; i++) { 		//피라미드 줄 띄워주는 for문
			for(int j = 1; j < num - i; j++) {	//별 앞에 공백 생성해주는 for문
				System.out.print(" "); 			//공백
			}for(int n = 0; n < i*2+1;n++) {	//별 만들어주는 for문, 1,3,5,7,9... 2n+1의 형태로 늘어남
				System.out.print("★");			//별
			}
			System.out.println();				//줄을 바꿔주는 println
		}
		
	}

}
