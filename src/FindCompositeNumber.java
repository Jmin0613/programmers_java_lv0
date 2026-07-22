public class FindCompositeNumber {
    public int solution(int n) {
        int answer = 0;

        //n까지 하나씩 꺼내기
        for(int i=1; i <= n; i++){
            int cnt = 0;

            // 약수 개수 검사
            for(int j=1; j <=i; j++){
                if(i%j == 0) cnt++;
            }

            // 3개 이상부터 카운트
            if(cnt >= 3) answer++;
        }
        return answer;
    }
}
