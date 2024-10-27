import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

// 다시 풀기 (우선순위 큐 원리 생각하며)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 ≤ N ≤ 100,000
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            // x는 2^31보다 작은 자연수 or 0
            int x =  Integer.parseInt(br.readLine());

            if (x == 0) {
                if (q.isEmpty()){
                    System.out.println(0);
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(x);
            }
        }



    }
}