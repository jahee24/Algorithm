package level_1;
//https://school.programmers.co.kr/learn/courses/30/lessons/258712
//가장 많이 받은 선물

import java.util.Arrays;

public class Solution_258712 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int[][] gift_table = new int[friends.length][friends.length];
        int[] gift_number_count = new int[50];
        int[] friend_next_month_count = new int[50];
        for (String gift : gifts) {
            String[] name = gift.split(" ");
            int temp_giver = 0;
            int temp_taker = 0;
            for (int i = 0; i < friends.length; i++) {
                if (friends[i].equals(name[0])) {
                    temp_giver = i;
                    gift_number_count[i]++;
                } else if (friends[i].equals(name[1])) {
                    temp_taker = i;
                    gift_number_count[i]--;
                }
            }
            gift_table[temp_giver][temp_taker]++;
        }
        for (int i = 0; i < friends.length; i++) {
            for (int j = i; j < friends.length; j++) {
                if (i != j) {
                    if (gift_table[i][j] > gift_table[j][i]) {
                        friend_next_month_count[i]++;
                    } else if (gift_table[i][j] < gift_table[j][i]) {
                        friend_next_month_count[j]++;
                    } else {
                        if (gift_number_count[i] > gift_number_count[j]) {
                            friend_next_month_count[i]++;
                        } else if (gift_number_count[i] < gift_number_count[j]) {
                            friend_next_month_count[j]++;
                        }
                    }
                }
            }
            if (answer < friend_next_month_count[i]) {
                answer = friend_next_month_count[i];
            }

        }
        return answer;
    }
}