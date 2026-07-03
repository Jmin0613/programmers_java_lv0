import java.util.HashMap;
import java.util.Map;

public class FindMaxCount {
    public int solution(int[] array) {
        int answer = 0;

        // 빈도수 맵 생성
        Map<Integer, Integer> countMap = new HashMap<>();

        // 빈도수 저장
        for(int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        // 맵에서 제일 큰 값(최빈값) 찾기
        int count;
        int maxCount = 0;
        for(int key : countMap.keySet()){
            count = countMap.get(key);

            if(count > maxCount){
                maxCount = count; // 최빈값 판단 cnt 저장
                answer = key; // 최빈값 인덱스 저장
            }
        }

        return answer;
    }
}
