public class ProgrammersPlanetAge {
    public String solution(int age) {
        String n = String.valueOf(age);
        StringBuilder result = new StringBuilder(n.length());

        for (int i = 0; i < n.length(); i++) {
            result.append((char) ('a' + (n.charAt(i) - '0')));
        }

        return result.toString();
    }

//        // 각 자리 맞춰 분리
//        int thousand = age / 1000;
//        int hundred = (age / 100) % 10;
//        int ten = (age / 10) % 10;
//        int one = age % 10;
//
//        // 문자 코드 차이 이용하여 변환 + 조립하여 반환
//        return "" + (char)('a'+thousand)
//                + (char)('a'+hundred)
//                + (char)('a'+ten)
//                + (char)('a'+one);
//    }
}
