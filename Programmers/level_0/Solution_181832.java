package level_0;
//https://school.programmers.co.kr/learn/courses/30/lessons/181832

import java.util.Arrays;

public class Solution_181832 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int temp_num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (temp_num <= n * n) {
            for (int i = left; i <= right; i++) {
                answer[top][i] = temp_num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = temp_num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                answer[bottom][i] = temp_num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                answer[i][left] = temp_num++;
            }
            left++;
        }
        return answer;
    }

}
