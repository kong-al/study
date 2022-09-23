package lv02;

public class Solution01 {
	
	static class Solution {
	    public String solution(String s) {
	    	String[] result = s.split(" ");
	    	String answer ="";
	        String max = result[0];
	        String min = result[0];
	        
			for(int i = 0 ; i < result.length;i++) {
				if(Integer.parseInt(result[i]) < Integer.parseInt(max)){
					max = result[i];
				}
			}
			
			for(int i = 0 ; i < result.length;i++) {
				if(Integer.parseInt(result[i]) > Integer.parseInt(min)) {
					min = result[i];
				}
			}
				answer += max + " " + min;

				return answer;
	    }
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println( solution.solution("4 5 3"));
	}

}
