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
		        for(int i = 0 ; i < num.length();i++) {
		        	// 순서대로 넣어줄 배열생성
		        	String[] result = new String[num.length()]; 
		        	// 반복문을 통해 스트링타입으로 받아온 파라미터값을 한글자씩 쪼개서 위 배열에 넣어줌
		        	result = num.split("");
		        	// 반환될 배열에 역순으로 넣어줌
		        	answer[(num.length()-1)-i] = Integer.parseInt(result[i]);
		        }
		        return answer;
		    }
	
}
