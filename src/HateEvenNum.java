public class HateEvenNum {
    public int[] solution(int n) {
        // 홀수 사이즈 배열 생성
        int[] answer = new int[(n+1)/2];

        // 홀수만 넣기
        for(int i=1; i<=n; i+=2){
            answer[i/2] = i;
        }
        return answer;
    }

}
