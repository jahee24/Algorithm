package level_1;
//https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Solution_70128 {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for(int i = 0;  i < a.length; i++){
            sum += a[i]*b[i];
        }
        return sum;
    }

}
