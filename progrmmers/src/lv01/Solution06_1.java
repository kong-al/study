package lv01;
import java.util.*;


//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

 public class Solution06_1 {
		class Solution {
		    public int[] solution(long n) {
		    	//파라미터로 받은 n값을 string타입으로 변환
		    	String num = Long.toString(n);
		    	// 배열을 만들어 위에서 스트링타입으로 받아온 파라미터값의 길이로 배열생성
		        int[] answer = new int[num.length()];
		        // 배열에 인덱스값으로 쓸 객체생성
		    	int cnt = 0;
		    	// 반복문을 통해
		    	while(n > 0) {
		    		// cnt 기본값이 0이므로 제일 처음에 10으로 나눈 값의 나머지를 answer[0]에 담아준다
		    		answer[cnt] = (int)( n%10);
		    		// n을 10으로 나눈값의 몫만을 가지며 나머지를 버린다.
		    		n = n/10;
		    		// cnt값을 증가시켜 다음 반복 때 인덱스값을 증가하여 값을 넣어준다.
		    		cnt++;
		    	}
		        
		        return answer;
		    }
		}
	
}