package lv02;

import java.lang.reflect.Array;
import java.util.Arrays;

// 실패

public class Solution02 {
	/*
	 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
	 * 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고) 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을
	 * 리턴하는 함수, solution을 완성해주세요.
	 */
	
	static class Solution {
	   
	   static public String solution(String s) {
	        String answer = "";
	        String[] result = s.split(" ");
	        System.out.println(Arrays.toString(result));
	        System.out.println(result[0].charAt(0));
	        
	        for(int i = 0 ; i <result.length ; i++) {
	        	
	        	System.out.println("isNum : " + Character.isDigit(result[i].charAt(0)));
	        	if(Character.isDigit(result[i].charAt(0)) != true){
	        		String[] a = new String[result[i].length()];
	        		a = result[i].split("");
	        		a[0] = Character.toString(Character.toUpperCase(result[i].charAt(0)));
	        		System.out.println("a : " + Arrays.toString(a));
	        		for(int j = 0 ; j <a.length; j++) {
	        			System.out.println("a의 값 "+a[j]);
	        			answer += a[j];
	        			System.out.println("answer : "+answer);
	        			}
	        		if(i != result.length) {
	        			answer += " ";
	        		}
	        		
	        	}else if(i != result.length){
	        		answer += result[i] + " ";
	        		System.out.println("숫자가 맨앞 : " + result[i]);
	        	}else {
	        		answer += result[i];
	        	}
	        
	    }
	        answer.trim();
	        return answer;
	}
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution("3jk sdf asdf");
	}
}
	