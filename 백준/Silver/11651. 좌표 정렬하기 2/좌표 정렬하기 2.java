import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 점의 개수 N (1 <= N <= 100,000)
        int N = scanner.nextInt();

        // 좌표를 담을 배열 선언
        // N개의 (x,y)
        int[][] cordinates = new int[N][2];

        // 입력받고, 배열에 저장하기.
        for (int i = 0; i < N; i++){
            // i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000)
            // 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            cordinates[i][0] = x;
            cordinates[i][1] = y;
        }

        // Arrays.sort를 이용하여 정렬하기. (Comparator 사용)
        Arrays.sort(cordinates, (e1,e2) -> {
            if (e1[1] == e2[1]){
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        // 출력
        for (int[] cordinate : cordinates) {
            System.out.println(cordinate[0] + " " + cordinate[1]);
        }
    }
}