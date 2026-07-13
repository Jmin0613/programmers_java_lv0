public class ArraySlice {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        System.arraycopy(numbers, num1, answer, 0, answer.length);
        return answer;

//        for(int i = 0; i< answer.length; i++){
//            answer[i] = numbers[num1+i];
//        }
//        return answer;
    }
}
