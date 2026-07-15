import java.util.Map;

public class MorseMap {
    class Solution {
        public String solution(String letter) {
            StringBuilder sb = new StringBuilder();

            // 모스 부호 -> 불변 map
            Map<String, String> morse = Map.ofEntries(
                    Map.entry(".-", "a"),
                    Map.entry("-...", "b"),
                    Map.entry("-.-.", "c"),
                    Map.entry("-..", "d"),
                    Map.entry(".", "e"),
                    Map.entry("..-.", "f"),
                    Map.entry("--.", "g"),
                    Map.entry("....", "h"),
                    Map.entry("..", "i"),
                    Map.entry(".---", "j"),
                    Map.entry("-.-", "k"),
                    Map.entry(".-..", "l"),
                    Map.entry("--", "m"),
                    Map.entry("-.", "n"),
                    Map.entry("---", "o"),
                    Map.entry(".--.", "p"),
                    Map.entry("--.-", "q"),
                    Map.entry(".-.", "r"),
                    Map.entry("...", "s"),
                    Map.entry("-", "t"),
                    Map.entry("..-", "u"),
                    Map.entry("...-", "v"),
                    Map.entry(".--", "w"),
                    Map.entry("-..-", "x"),
                    Map.entry("-.--", "y"),
                    Map.entry("--..", "z")
            );

            // 공백 기준으로 쪼개기
            String[] morseStr = letter.split(" ");

            // 해시맵 해당 키 꺼내기
            for(String word : morseStr){
                sb.append(morse.get(word));
            }

            return sb.toString();
        }
    }
}
