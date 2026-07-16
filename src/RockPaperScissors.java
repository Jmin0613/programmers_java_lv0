public class RockPaperScissors {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for(char n : rsp.toCharArray()){
            if(n=='2') sb.append('0');
            if(n=='0') sb.append('5');
            if(n=='5') sb.append('2');
        }

        return sb.toString();
    }
}
