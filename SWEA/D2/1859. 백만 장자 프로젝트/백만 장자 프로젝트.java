
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 갯수 입력 받기

        // T개의 테스트 케이스
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt(); // N일
            // N일간의 매매가 입력 받기
            int[] price = new int[n];
            for (int i = 0; i < n; i++){
                price[i] = scanner.nextInt();
            }
            // 최대한의 이익을 담을 변수
            // 2 <= N <= 1,000,000이며, 각 날의 매매가는 10,000 이하로,
            // answer이 int의 범위를 뛰어넘을 확률이 있다.
            long answer = 0;

            // ========== 풀이 ==========
            // 뒤에서부터 탐색한다.
            // 우선 price[n-1], 즉 price의 마지막 원소를 기준으로 한다.
            // 그렇게 쭉 n-2부터, 0까지 하나씩 줄여가면서 반복문을 순회하는데,
            // price[i]값이 그 기준값보다 작을 경우,
            // count는 1더하고, answer는 그 수만큼 빼준다.
            // 그리고 결국 기준값보다 price[i]가 크게 된다면,
            // answer에 count * standardPrice를 더해주고, count는 0으로 초기화 후, 기준값을 price[i]로 바꾼다.
            // 이 과정을 반복문이 끝날때까지 반복한다.

            int standardPrice = price[n-1]; // 맨 뒤의 수를 우선 기준값으로 초기 설정 해준다.
            int count = 0;  // 기준 값보다, 작은 값이 나온 횟수를 세준다.
            // 그리고, n-2 인덱스부터 0번째 인덱스까지 순회한다.
            for (int i = n-2; i >=0; i--){
                if (price[i] > standardPrice){ // 기준값보다 price[i]가 클 경우
                    answer += (long) standardPrice * count;
                    count = 0;
                    standardPrice = price[i];
                } else { // 기준값보다 price[i]가 작을 경우
                    count++;
                    answer -= price[i];
                }
            }

            // 만약 3 4 5같이, 끝까지 5보다 큰 값이 안나올수도 있다.
            // 그 경우를 대비하여, 이 문장을 작성해준다.
            answer += (long) count * standardPrice;

            // 최대의 이득을 출력한다.
            System.out.println("#" + test_case + " " + answer);
        }
    }
}