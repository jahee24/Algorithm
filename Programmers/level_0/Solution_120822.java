package level_0;

import java.util.Arrays;

public class Solution_120822 {
    public String solution(String my_string) {
        int len = my_string.length();
        char[] arr = new char[len];
        for(int index = 0; index < len; index++){
            arr[index] = my_string.charAt(len - 1 - index);
        }
        String answer = String.valueOf(arr);
        return answer;
    }

}
