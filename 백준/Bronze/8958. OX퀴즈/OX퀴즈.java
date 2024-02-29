import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // OX퀴즈의 개수를 입력받는다.

        // OX 퀴즈를 입력받으면서,
        for (int i = 0; i < n; i++){
            String quizOX = scanner.next(); // OX 퀴즈를 입력받는다.
            int count = 0; // O가 나온 각 시점들에서 점수를 세는 변수
            int totalCount = 0; // 전체 점수를 셀 변수
            for (int j = 0; j < quizOX.length(); j++){
                if (quizOX.charAt(j) == 'O'){
                    count++;
                    totalCount += count;
                } else {
                    count = 0;
                }
            }
            // 총 점수 출력
            System.out.println(totalCount);
        }
    }
}