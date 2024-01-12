import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] realChess = {1,1,2,2,2,8}; // 원래 체스 구성

        int[] myChess = new int[6]; // 동혁이가 발견한 흰색 피스들의 구성
        for (int i = 0; i < 6; i++){
            myChess[i] = scanner.nextInt();
        }

        // 비교
        for (int i = 0; i < 6; i++){
            System.out.print((realChess[i]-myChess[i]) + " ");
        }
    }
}