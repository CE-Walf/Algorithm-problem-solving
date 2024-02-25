import java.util.Scanner;

public class Main {
    static boolean[][] booleanBingo; // 빙고판 전역변수 선언

    static boolean is3Bingo() {
        int totalCount = 0;

        // 가로 체크
        for (int i = 0; i < 5; i++) {
            int countWidth = 0;
            for (int j = 0; j < 5; j++) {
                if (booleanBingo[i][j] == true){
                    countWidth++;
                } else{
                    countWidth = 0;
                    break;
                }
            }
            if (countWidth == 5){
                totalCount++;
            }
        }

        // 세로 체크
        for (int i = 0; i < 5; i++) {
            int countHeight = 0;
            for (int j = 0; j < 5; j++) {
                if (booleanBingo[j][i] == true){
                    countHeight++;
                } else{
                    countHeight = 0;
                    break;
                }
            }
            if (countHeight == 5){
                totalCount++;
            }
        }

        // 왼쪽 위로 올라가는 대각선 체크
        int countRightDiagonal = 0;
        for (int i = 0; i < 5; i++){
            if(booleanBingo[i][i] == true) {
                countRightDiagonal++;
            } else {
                break;
            }
            if (countRightDiagonal == 5){
                totalCount++;
            }
        }

        // 오른쪽 위로 올라가는 대각선
        int countLeftDiagonal = 0;
        for (int i = 0; i < 5; i++){
            if(booleanBingo[i][4-i] == true){
                countLeftDiagonal++;
            } else {
                break;
            }
            if (countLeftDiagonal == 5){
                totalCount++;
            }
        }

        // 반환
        if (totalCount >= 3){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 빙고판 배열 생성
        int[][] bingo = new int[5][5];
        booleanBingo = new boolean[5][5];

        // 빙고판 입력받기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = scanner.nextInt();
            }
        }

        // 숫자를 입력 받고, 함수에 집어넣어 제거
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            count++;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (num == bingo[i][j]) {
                        booleanBingo[i][j] = true;
                    }
                }
            }

            boolean flag = is3Bingo();
            if (flag) {
                System.out.println(count);
                break;
            }
        }
    }
}
