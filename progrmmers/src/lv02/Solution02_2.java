package lv02;

import java.lang.reflect.Array;
import java.util.Arrays;

// 실패

public class Solution02_2 {
	/*
	 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
	 * 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고) 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을
	 * 리턴하는 함수, solution을 완성해주세요.
	 */
	
	static class Solution {
		    public String solution(String s) {
		        String answer = "";
		        String[] str = s.toLowerCase().split(" ");
		        
		        for(int i = 0 ; i < str.length; i++) {
		        }
		        	
		        
		        return answer;
            }
}
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution("3jk sd3df aDGFdf");
	}
}
	