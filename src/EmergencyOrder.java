public class EmergencyOrder {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // 전체 순회하며 비교
        for (int i = 0; i < emergency.length; i++) {
            int trg = 1; //기본

            for (int j = 0; j < emergency.length; j++) {
                // i < j
                if (emergency[i] < emergency[j]) trg++;
                answer[i] = trg;
            }
        }
        return answer;
    }
}
