import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==== 미리 값을 다 구해두자. ====
        // 0층의 i호에는 i명이 산다. -> 초기값 설정 해주자.
        int [][] apartment = new int[15][15];
        for (int i = 1; i <= 14; i++) {
            apartment[0][i] = i;
        }
        // 아파트는 0층부터, 각 층에는 1호부터
        // “a층의 b호에 살려면,
        // 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                for (int k = 1; k <= j; k++) {
                    apartment[i][j] += apartment[i - 1][k];
                }
            }
        }

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++){
            // k층의 n호에는 몇명이 살고 있을까. 거주민 출력하기
            // 1 <= k, n <= 14
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(apartment[k][n]);
        }

    }
}