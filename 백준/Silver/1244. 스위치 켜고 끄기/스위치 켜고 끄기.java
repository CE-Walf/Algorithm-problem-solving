import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 스위치의 개수
        int n = scanner.nextInt();
        // 스위치의 상태 입력 받기
        int[] switchStatus = new int[n + 1];
        for (int i = 1; i <= n; i++){
            switchStatus[i] = scanner.nextInt();
        }

        // 학생 수 입력받기
        int studentCount = scanner.nextInt();

        // 학생의 성별, 학생이 받은 수 입력받으면서, 알고리즘 시작.
        for (int i = 0; i < studentCount; i++){
            int gender = scanner.nextInt();
            int number = scanner.nextInt();

            // 남자 일때,
            if (gender == 1) {
                for (int j = number; j < switchStatus.length; j += number) {
                    if (switchStatus[j] == 0) {
                        switchStatus[j] = 1;
                    } else {
                        switchStatus[j] = 0;
                    }
                }
            }
            // 여자일 때,
            else if (gender == 2){
                // 구간  찾기
                int start = number;
                int end = number;

                for (int j = 1; j < n / 2 ; j++){
                    if (number - j <= 0 || number + j > n) break;

                    if (switchStatus[number - j] == switchStatus[number + j]){
                        start -= 1;
                        end += 1;
                    } else {
                        break;
                    }
                }

                // 구간 스위치 변환
                for (int j = start; j <= end; j++){
                    if (switchStatus[j] == 0) {
                        switchStatus[j] = 1;
                    } else {
                        switchStatus[j] = 0;
                    }
                }
            }
        }

        // 20개씩 나누어 출력
        int nShare = n / 20;
        int nMod = n % 20;

        for (int i = 0; i <= nShare; i++){
            for (int j = 1; j <= (i == nShare ? nMod : 20); j++){
                System.out.print(switchStatus[j + i * 20] + " ");
            }
            System.out.println();
        }

    }
}