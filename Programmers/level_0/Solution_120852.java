package level_0;

import java.util.ArrayList;
import java.util.List;
public class Solution_120852 {
    public int[] solution(int n) {
        List<Integer> tempList = new ArrayList<>();
        for(int number = 2; number <= n; number++){
            if (n % number == 0) {
                tempList.add(number);
                while (n % number == 0) {
                    n /= number;
                }
            }
        }
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        return answer;
    }

}