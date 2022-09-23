package lv01;
import java.util.*;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

public class Solution04_1 {
	public class Solution {
	    public int solution(int n) {
	    	
	    	int answer = 0;
	    	// 숫자 n을 String 타입으로 변환
	    	String num = Integer.toString(n);
	    	// 반복문을 String 타입으로 변환한 n 의 자릴수 만큼 반복시켜준다.
	    	for(int i = 0 ; i < num.length(); i++){
	    		String[] result = new String[num.length()]; 
	    		// String타입으로 변환된 n을 한자씩 쪼개어 String배열인 result에 넣어준다
	    		result = num.split("");
	    		// String타입으로 하나씩 쪼개져 result[i]들어있는 값을 숫자로 변환 후 answer에 더해준다
	    		answer += Integer.parseInt(result[i]);
	    	}
	        return answer;
	    }
	}

}
