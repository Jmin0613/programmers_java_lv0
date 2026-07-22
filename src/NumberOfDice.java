public class NumberOfDice {
    public int solution(int[] box, int n) {
        // 높이에서 몇개 들어가는지 파악
        // int h = box[2]/n;

        // 가로에서 몇개 들어가는지 파악
        // int w = box[0]/n;

        // 세로에서 몇개 들어가는지 파악
        // int l = box[1]/n;

        // return h*w*l;
        return (box[2]/n)*(box[0]/n)*(box[1]/n);
    }
}
