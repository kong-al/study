package array;

import java.util.Scanner;
import java.util.*;

public class Ex10818 {
	public static void main(String[] args) {
//		baekjoon 10818번
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(!(1 <= n && n <=1000000)) {
			System.out.println("1,000,000보다 작은 양수를 입력하세요");
		}
//		배열생성
		int[] num = new int[n];

//		배열에 입력 값 할당
		for (int i = 0 ; i < n;i++) {
			num[i]=sc.nextInt();
		}
		int max = num[0];
		int min = num[0];

		for(int i= 0 ; i < n ;i++) {
			if(num[i] > max) {
				max = num[i];
			}
			if(num[i] < min) {
				min = num[i];
			}
		}


		System.out.println(max+ " " + min);
	}
}
