import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstA = scanner.nextInt();
        int firstB = scanner.nextInt();

        int secondA = scanner.nextInt();
        int secondB = scanner.nextInt();

        // 분모를 firstB * secondB로 통일 시켜주고, 그 둘을 더해주자.
        int answerA = firstA * secondB + firstB * secondA;
        int answerB = firstB * secondB;

        // 이제 answerA와, answerB의 최대공약수를 찾아서, 나누어 주자.
        int gcd = getGCD(answerA, answerB);

        answerA = answerA / gcd;
        answerB = answerB / gcd;

        System.out.println(answerA + " " + answerB);

    }

    // 유클리드 호제법 사용하여 gcd 구하기
    static int getGCD(int a, int b){
        if (a % b == 0){
            return b;
        } else {
            return getGCD(b, a % b);
        }
    }
}