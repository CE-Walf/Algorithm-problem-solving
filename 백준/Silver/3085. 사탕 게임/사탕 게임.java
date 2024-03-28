import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static int N; // 보드판의 크기 선언
    static String[][] board;     // 보드판 선언


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 보드의 크기 N (3 <= N <= 50) 입력받기
        N = Integer.parseInt(br.readLine());
        board = new String[N][N]; // 보드판 NxN으로 초기화

        // 보드판 입력 받기
        // 빨간색 : C, 파란색 : P, 초록색 : Z, 노란색 : Y
        for (int i = 0; i < N ; i++){
            String[] tempList = br.readLine().split("");
            for (int j = 0; j < N; j++){
                board[i][j] = tempList[j];
            }
        }

        // 모든 부분을 다 탐색하고, 최대길이도 계산한다.
        int answer = exChangeBoard();
        System.out.println(answer);
    }

    static int exChangeBoard(){
        int max = 0;

        // 가로로만 보드판 바꾸기
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N-1; j++){
                String temp = board[i][j+1];
                board[i][j+1] = board[i][j];
                board[i][j] = temp;
                // 겹치는 최대의 사탕 찾기
                int tempMax = searchSameMax();
                max = Math.max(tempMax,max);
                // 그리고 다시 원상복귀
                temp = board[i][j+1];
                board[i][j+1] = board[i][j];
                board[i][j] = temp;
            }
        }

        // 세로로 보드판 바꾸기
        // 가로로만 보드판 바꾸기
        for (int i = 0; i < N-1; i++){
            for (int j = 0; j < N; j++){
                String temp = board[i+1][j];
                board[i+1][j] = board[i][j];
                board[i][j] = temp;
                // 겹치는 최대의 사탕 찾기
                int tempMax = searchSameMax();
                max = Math.max(tempMax,max);
                // 그리고 다시 원상복귀
                temp = board[i+1][j];
                board[i+1][j] = board[i][j];
                board[i][j] = temp;
            }
        }
        return max;
    }

    // 가장 길게 연결되어있는 값 찾기
    static int searchSameMax(){
        int max = 0;

        // 가로줄들 체크
        for (int i = 0; i < N; i++){
            int count = 1;
            for (int j = 0; j < N-1; j++){
                if (board[i][j].equals(board[i][j+1])){
                    count += 1;
                } else {
                    count = 1;
                }
                max = Math.max(count, max);
            }
        }
        // 세로줄 체크
        for (int j = 0; j < N; j++){
            int count = 1;
            for (int i = 0; i < N-1; i++){
                if (board[i][j].equals(board[i+1][j])){
                    count += 1;
                } else {
                    count = 1;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}