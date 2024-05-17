import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N명의 사람, K번째 사람을 제거
        // 1 <= K <= N <= 1,000
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 요세푸스 순열을 구현해보자.

        // Queue를 선언한다.
        Queue<Integer> queue = new LinkedList<>();

        // Queue에 1부터 N까지 값을 넣어주자.
        for (int i = 1; i <= N; i++){
            queue.add(i);
        }

        // 반복문을 통해, 계속 순회하면서,
        // StringBuilder를 이용히여, 값을 추가해주자.
        // 값은 <3, 6, 2, 7, 5, 1, 4> 이런 형식이 되어야 한다.
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1){
            // 자 우선, K번째 이하는 queue의 뒤에 붙여야한다.
            for (int i = 0; i < K -1; i++){
                queue.add(queue.poll());
            }
            // 그리고 k번째 수는, StringBuilder로 append해주자.
            sb.append(queue.poll());
            sb.append(", ");
        }

        // 마지막 값은 ,가 없어야한다.
        sb.append(queue.poll());
        sb.append(">");

        // 출력
        System.out.println(sb);
    }
}