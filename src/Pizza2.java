public class Pizza2 {
    public int solution(int n) {
        // 최대 공배수 ((n*6)/gcd)를 /6
        return n / gcd(n, 6);
    }

    // 최대 공약수
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}
