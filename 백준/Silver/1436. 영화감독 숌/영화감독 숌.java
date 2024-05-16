import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N은 10,000보다 작거나 같은 자연수
        int N = scanner.nextInt();

        // 666부터 시작. (N이 1이면, 666이 답이다.)
        int answer = 666;
        int count = 0;
        while (true) {
            // 반복문을 지날때마다, answer의 값을 1씩 올려주는데,
            // answer이 666을 포함하고 있다면 1씩 count 변수의 값을 올려주고,
            // N과 Count가 같아졌을때의 반복문을 탈출하고 answer를 출력한다.
            if (Integer.toString(answer).contains("666")) {
                count++;
            }
            if (count == N) break;
            answer++;
        }

        System.out.println(answer);
    }
}