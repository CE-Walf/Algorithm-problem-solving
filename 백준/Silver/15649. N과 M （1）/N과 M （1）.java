import java.util.Scanner;

public class Main {
    static int n, r; // nPr
    static boolean[] isVisited; // 방문자 배열
    static int[] intArr; // 값을 넣는 배열

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        r = scanner.nextInt();

        isVisited = new boolean[n];
        intArr = new int[r];

        // 재귀를 사용하여 풀어보자.
        printPermutation(0);
    }

    static void printPermutation(int rCount) {
        if (rCount == r) {
            for (int i = 0; i < r; i++) {
                System.out.print((intArr[i] + 1) + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n ; i++) {
            if (isVisited[i] == false) {
                isVisited[i] = true;
                intArr[rCount] = i;
                printPermutation(rCount + 1);
                isVisited[i] = false;
            }
        }

    }
}