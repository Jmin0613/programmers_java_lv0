public class ArrayAvg {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int i : numbers){
            answer += i;
        }
        return answer/numbers.length;
    }

}
