import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 0 ≤ N ≤ 100,000
        // 0 ≤ K ≤ 100,000
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 수빈이는 걷거나 순간이동할 수 있다.
        // 위치가 X일 때 걷는다면, 1초 후에 X-1, X+1로 이동하게 된다.
        // 순간이동을 하는 경우, 1초 후에 2*X 위치로 이동하겓 된다.
        // 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하자.

        bfs(N, K);

        System.out.println(visited[K] - 1);

    }

    public static void bfs(int N, int K){
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = 1; // 시작 자리는 이미 거쳤으므로 1로 표시한다.
        
        while(!q.isEmpty()) {
            int locationOfSubin = q.poll();

            if (locationOfSubin == K){
                break;
            }

            int firstLocation = locationOfSubin * 2;
            int secondLocation = locationOfSubin + 1;
            int thirdLocation = locationOfSubin - 1;


            if (firstLocation <= 100000 && visited[firstLocation] == 0) {
                q.add(firstLocation);
                visited[firstLocation] = visited[locationOfSubin] + 1;
            }

            if (secondLocation <= 100000 &&visited[secondLocation] == 0) {
                q.add(secondLocation);
                visited[secondLocation] = visited[locationOfSubin] + 1;
            }

            if (thirdLocation >= 0 && visited[thirdLocation] == 0) {
                q.add(thirdLocation);
                visited[thirdLocation] = visited[locationOfSubin] + 1;
            }

        }
    }
}