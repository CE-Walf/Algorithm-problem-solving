import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 미리 하얀색, 검정색으로 시작하는 8x8을 만들고 비교하자.
    // 8 x 8 하얀색으로 시작하는 체스판
    static char[][] whiteChessBoard = {
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };

    // 8 x 8 검정색으로 시작하는 체스판
    static char[][] blackChessBoard = {
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    };

    // 입력받은 체스판 (정적으로 선언)
    static char[][] chessBoard;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력받은 체스판의 크기 N x M ( 8 <= N, M <= 50 )
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 체스판을 2차원 배열로 입력받는다.
        chessBoard = new char[N][M];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                chessBoard[i][j] = temp.charAt(j);
            }
        }

        // 정답을 담을 변수
        int answer = Integer.MAX_VALUE;

        // 이제 주어진 배열을 8x8로 쪼개어준다.
        // 8 x 8 정사각형의 가장 왼쪽 위 좌표를 찾는다.
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 해당하는 8 x 8 체스판을 제대로 만드려면 얼마나 뒤집어야 할까?
                int tempCount = countBoardNeedChange(i, j);
                if (tempCount < answer) {
                    answer = tempCount;
                }
            }
        }

        System.out.println(answer);

    }

    static int countBoardNeedChange(int startRow, int startCol) {
        // 64 - 바꿔야할 흰색 칸 =  바꿔야 할 검정 칸이다.
        // 이걸 생각하며 코드를 작성해보자.

        int count = 0;

        // 8 x 8의 체스판을 순회하며, W B W B가 반복되며 나와야한다.
        // 우선 B가 맨 위에 있다고 가정하고,
        char compColor = 'B';

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (chessBoard[i][j] != compColor){
                    count++;
                }

                // 반복문을 한 번 순회할 때마다, 비교하는 값을
                // B면 W로, W면 B로 바꾸어준다.
                // 허나 주의할 점은, 한줄의 끝 값이, 다음 줄의 첫값과 같다는 것이다.
                if (compColor == 'B') {
                    if (j != startCol + 8 - 1){
                        compColor = 'W';
                    }
                } else {
                    if (j != startCol + 8 - 1){
                        compColor = 'B';
                    }
                }
            }
        }

        return Math.min(count, 64 - count);
    }

}