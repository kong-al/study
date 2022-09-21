package lv02;

public class Solution01 {
	
	static class Solution {
	    public String solution(String s) {
	    	String[] result = s.split(" ");
	        String answer = result[0];
	        String max = null;
	        String min = null;
	        
				for(int i = 0 ; i < result.length;i++) {
					if(Integer.parseInt(result[i]) > Integer.parseInt(answer)){
						System.out.println("max1 "+max);
						System.out.println("answer "+answer);
					}max = result[i];
					System.out.println("max2 "+max);
				}
				
				for(int i = 0 ; i < result.length;i++) {
					if(Integer.parseInt(result[i]) < Integer.parseInt(answer)) {
						System.out.println("min" + min);
						System.out.println("answer "+answer);
					}min = result[i];
					System.out.println("min2 "+ min);
					
					
				}
				answer = "";
				answer += max + min;
				System.out.println("max 결론 "+max);
				System.out.println("min 결과 "+ min);
				return answer;
	    }
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println( solution.solution("4 5 3"));
	}

}
