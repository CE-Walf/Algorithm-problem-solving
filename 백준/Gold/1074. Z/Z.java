import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다시 풀기
public class Main {

    static int r, c; // 탐색할 목표 위치의 행(r)과 열(c)
    static int count = 0; // 방문 순서를 누적하는 변수
    static int answer; // 답을 담을 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1 ≤ N ≤ 15
        // 0 ≤ r, c < 2^N
        int N = Integer.parseInt(st.nextToken()); //N은 2^N x 2^N인 2차원 배열을 나타냄
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        // 전체 배열의 크기 (2^N)
        int size = (int) Math.pow(2, N);

        // r행 c열을 몇 번째로 방문했는지 재귀로 계산한다.
        findAnswer(size, 0, 0);

        System.out.println(answer);
    }


    // 분할 정복을 통해 목표 좌표를 탐색하는 메서드
    // size : 현재 탐색하는 영역의 크기
    // x, y : 현재 탐색중인 영역의 좌상단 좌표 (초기 값 0,0)
    static void findAnswer(int size, int x, int y) {
        if (size == 1) { // size가 1일 때, answer에 count를 저장하고 종료한다.
            answer = count;
            return;
        }

        // size를 반으로 나누어 재귀적으로 탐색한다.
        size = size / 2;

        // (r, c)가 현재 탐색 중인 각 사분면에 속하는지 확인하고 재귀 호출
        if (r < x + size && c < y + size) {     // 제 2사분면에 속할 경우
            // 현재 좌표가 속한 사분면으로 이동
            findAnswer(size, x, y);
        } else if (r < x + size && c >= y + size) {     // 제 1사분면에 속할 경우
            // 이전 사분면의 칸 수를 더하고, 우상단으로 이동
            count += size * size;
            findAnswer(size, x, y + size);
        } else if (r >= x + size && c < y + size) {     // 제 3사분면에 속할 경우
            // 두 번째 사분면의 칸 수를 더하고, 좌하단으로 이동
            count += size * size * 2;
            findAnswer(size, x + size, y);
        } else {    // 제 4사분면에 속할 경우
            // 세 번째 사분면의 칸 수를 더하고, 우하단으로 이동
            count += size * size * 3;
            findAnswer(size, x + size, y + size);
        }
    }
}