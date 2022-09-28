package lv01;
import java.util.*;

//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//예를들어 n이 118372면 873211을 리턴하면 됩니다.

public class Solution09 {
	class Solution {
	    public long solution(long n) {
	    	String num = Long.toString(n);
	    	long answer = 0;
	    	int[] result = new int[num.length()];
            for(int i = 0 ; i < num.length(); i++) {
            	result[i] = (int)( n%10);
	    		n = n/10;
	    	}
            Arrays.sort(result);
            for(int i = 0 ; i < result.length;i++) {
            	answer += result[i];
            }
            return answer;
	    }
	}
}

