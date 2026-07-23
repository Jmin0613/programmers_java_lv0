public class MakeMaxNum {
    public int solution(int[] numbers) {
        int m1 = Math.max(numbers[0], numbers[1]);
        int m2 = Math.min(numbers[0], numbers[1]);

        for(int i = 2; i< numbers.length; i++){
            if(m1 <= numbers[i]){
                m2 = m1;
                m1 = numbers[i];
            }else if(m2 < numbers[i] ){
                m2 = numbers[i];
            }
        }
        // System.out.println(m1);
        // System.out.println(m2);
        return m1*m2;
    }
}
