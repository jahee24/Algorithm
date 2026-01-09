package level_0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120898
public class Solution120898 {
    public int solution(String message) {
        char[] letter = message.toCharArray();
        return letter.length * 2;
    }
}