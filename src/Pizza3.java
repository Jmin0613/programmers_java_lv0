public class Pizza3 {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = n/slice;

        if(n%slice != 0){
            answer++;
        }

        return answer;
    }
}
