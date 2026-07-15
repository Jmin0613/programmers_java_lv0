public class MorseMapTwo {
    // 다른사람 코드 보완해보기.
    public String solution(String letter) {
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };

        StringBuilder answer = new StringBuilder();
        String[] words = letter.split(" ");

        for(String word : words){
            for(int j = 0; j < morse.length; j++){
                if(word.equals(morse[j])){
                    answer.append((char) ('a' + j));
                    break;
                }
            }
        }

        return answer.toString();
    }
}

/* 원본 코드
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");

        for(int i=0;i<word.length;i++){
            for(int j=0;j<morse.length;j++){
                if(word[i].equals(morse[j])) answer+=(char)(j+97);
            }
        }

        return answer;
    }
}
 */
