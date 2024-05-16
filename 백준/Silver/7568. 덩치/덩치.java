import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 전체 사람 수 ( 2 <= N <= 50)
        int N = scanner.nextInt();

        // 데이터를 담을 배열
        int[][] nData = new int[N][2];

        // 몸무게, 키 데이터 배열에 담기.
        for (int i = 0; i < N; i++){
            // 몸무게 x, 키 y (0 <= x, y <= 200)
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            nData[i][0] = x;
            nData[i][1] = y;
        }

        // 등수를 담을 배열
        int[] rank = new int[N];

        // 등수 계산하기
        for (int i = 0; i < N; i++){
            // 1부터 등수 세기
            int rankCount = 1;
            for (int j = 0; j < N; j++){
                if (i == j)continue;
                if (nData[i][0] < nData[j][0] && nData[i][1] < nData[j][1]){
                    rankCount++;
                }
            }
            rank[i] = rankCount;
        }

        // 출력
        for (int i = 0; i < N; i++){
            System.out.print(rank[i] + " ");
        }

    }
}