public class FactorialFunc {
    public int solution(int balls, int share) {
        long answer = 1;

        // C(n,r) = C(n, r-1)
        // 더 작은 함수 구하기 (r-1)
        int min = Math.min(share, balls-share);

        for(int i = 1; i <= min; i++){
            answer = answer * (balls-i+1)/i;
        }

        return (int) answer;
    }
}
