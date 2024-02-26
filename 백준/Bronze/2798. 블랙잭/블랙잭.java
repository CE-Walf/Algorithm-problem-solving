import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카드의 수(N)과 넘지 말아야할 수(M) 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // N개 크기의 배열에 주어진 카드 담기
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = scanner.nextInt();
        }

        // 탐색 로직
        int blackJack = 0;
        int sumOfCard = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sumOfCard = card[i] + card[j] + card[k];

                    if (sumOfCard <= M) {
                        if (blackJack < sumOfCard) {
                            blackJack = sumOfCard;
                        }
                    }

                }
            }
        }

        System.out.println(blackJack);


    }
}