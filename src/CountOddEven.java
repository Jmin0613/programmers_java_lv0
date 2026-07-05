public class CountOddEven {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        int i=0;

        while(i < num_list.length){
            if(num_list[i]%2!=0) odd++;
            else even++;
            i++;
        }

        return new int[]{even, odd};
    }
}
