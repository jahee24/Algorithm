import level_0.Solution_120852;
import level_0.Solution_181832;
import level_1.Solution_258712;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution_120852 solution = new Solution_120852();
        int[] ans = solution.solution(8);
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(ans));
        }
    }
}
