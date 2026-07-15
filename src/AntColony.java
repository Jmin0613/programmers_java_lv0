public class AntColony {
    public int solution(int hp) {
        int answer = 0;

        // 장군개미 5
        answer += hp/5;
        hp %= 5;

        // 병정개미 3
        answer += hp/3;
        hp %= 3;

        // 일개미 1
        answer += hp;

        return answer;
    }
}
