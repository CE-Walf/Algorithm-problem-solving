class Solution {
    public int solution(int a, int b) {
        // a와 b의 최대공약수를 구하고, 그 최대공약수로 나눈 후 분모의 소인수가 2와 5만 존재하는지 확인하자. 
        
        int gcd = getGcd(a, b);

        b = b / gcd;
    
        // 분모 b에서 2와 5를 계속 나눠서 확인
        while (b % 2 == 0) {
            b /= 2;
        }
        
        while (b % 5 == 0) {
            b /= 5;
        }
            
        return b == 1 ? 1 : 2;
    }
    
    static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
        
    }
}