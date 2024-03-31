import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 수빈이가 이동하려고 하는 채널 N (0 <= N <= 500,000)
        int N = scanner.nextInt();

        // 고장난 버튼의 개수 입력 받기
        int M = scanner.nextInt();

        // 고장난 버튼 입력 받기
        // 버튼 상태 배열 => true : 고장, false : 정상
        boolean[] buttonStatus  = new boolean[10];
        for (int i = 0; i < M; i++){
            int button = scanner.nextInt();
            buttonStatus[button] = true;
        }

        // 여기서는 두가지를 고려해야한다.
        // 1. +, -를 이용하여 채널을 이동할 수 있는 경우
        // 2. 번호를 입력하여 채널을 이동할 수 있는 경우
        // 3. 번호를 입력하여 그에 근사한 채널로 이동하고, +와 -를 이용하여 이동하는 경우

        // 현재 채널은 100이다.
        // 첫 번째로, 우선 +나 -를 이용하여 가는 경우이다. (초기 값 설정)
        int moveChannelCount = Math.abs(N - 100);

        // 9999999 번까지의 채널을 탐색하여, 번호를 누르는 과정을 통해 이동할 수 있는지 확인
        // 여기서 999999까지 해주는 이유는, N의 입력이 500,000로 제한되어 있지만,
        // 50만이 초과되는 수에서, -를 눌러 해당 수로 가는게 빠른 경우가 있을수도 있기 때문이다.
        // 아래의 과정을 통해, 채널만 누르는 방법, 근사한 채널로 이동하고, +와 -를 이용하여 이동하는 경우의 방법이 다 가능하다.
        for (int i = 0; i <= 999999; i++) {
            String iStr = String.valueOf(i);
            int iStrLength = iStr.length();
            boolean isBreak = false;

            // 고장난 버튼을 눌러야 하는 수라면, 반복문 탈출
            for (int j = 0; j < iStrLength; j++) {
                int checkButton = iStr.charAt(j) - '0';
                if (buttonStatus[checkButton]) {
                    isBreak = true;
                    break;
                }
            }
            // i번 채널을 누를때, 고장난 버튼을 누르지 않으면,
            if (!isBreak) {
                // i를 누르고, N까지 이동하는 횟수이다.
                int temp = Math.abs(N - i) + iStrLength;
                moveChannelCount = Math.min(temp, moveChannelCount);
            }
        }

        // 값을 출력해준다.
        System.out.println(moveChannelCount);
    }
}