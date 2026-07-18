public class RotateArray {
    public int[] solution(int[] numbers, String direction) {
        // 오른쪽
        if(direction.length()>4){
            int tmp = numbers[numbers.length - 1];

            for(int i = numbers.length-1; i>0; i--) {
                numbers[i] = numbers[i-1];
            }
            numbers[0]=tmp;
            return numbers;
        }
        // 왼쪽
        int tmp = numbers[0];

        for (int i=0; i < numbers.length-1; i++) {
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.length-1] = tmp;
        return numbers;
    }
}

