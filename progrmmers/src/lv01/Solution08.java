package lv01;
import java.util.*;

//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 
//18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

public class Solution08 {
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        //	각자리수끼리 더해지는 값
        int result = 0;
        // 반복문에서 X 값이 0이 되므로 X랑 같은 값을 둔다.
        int num = x;
        // 반목문을 통해 각자리수를 더해준다
    	while(num != 0) {
    		result += num%10;
    		num/=10;
    	}
    	// 삼항연산자를 통해 x가 result값으로 나누어 지면 true / 그렇지 않으면 false를 반환
		answer = (x%result == 0)?true : false;

        return answer;
    }
}}
