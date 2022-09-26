package lv01;
import java.util.*;

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다
//단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

public class Solution07 {
	static class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        // toLowerCase()를 사용해 파라미터로 받아온 s의 값을 소문자로 모두 변경한다
	        s = s.toLowerCase();
	        // p와 y 의 갯수를 담을 객체생성
	        int p = 0 ;
	        int y = 0 ;
	        
	        for(int i = 0 ; i < s.length();i++) {
	        	// 반복문을 통해 s를 한글자씩 쪼개어 배열에 넣는다
	        	String[] result = new String[s.length()];
	        	result = s.split("");
	        	// 조건식을 통해 s에 "p"/"y"의 값을 찾아 갯수를 세어준다
	        	if(result[i].equals("p")){
	        		p++;
	        		System.out.println(p);
	        	}else if(result[i].equals("y")) {
	        		y++;
	        		System.out.println(y);
	        	}
	        }
	        // p와 y의 갯수를 비교하여 같으면  true / 다르면 false를 반환
	        if(p != y) {
	        	answer = false;
	        }
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution("pPoooyY");
	}
}
