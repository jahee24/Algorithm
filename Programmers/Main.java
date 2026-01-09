import level_1.Solution_258712;

public class Main {
    public static void main(String[] args) {

        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        Solution_258712 solution = new Solution_258712();
        System.out.println(solution.solution(friends, gifts));
    }
}
