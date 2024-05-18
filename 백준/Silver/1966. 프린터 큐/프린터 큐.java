import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 테스트 케이스의 수
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			// 인덱스와, 중요도를 저장하는 큐를 생성한다.
			// 0 = 인덱스, 1 = 중요도
			Queue<int[]> queue = new LinkedList<>();

			// 문서의 개수 N(1 ≤ N ≤ 100)
			int N = scanner.nextInt();

			// 몇 번째로 인쇄되었는지 궁금한 문서가
			// 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)
			// 중요 -> 0부터 시작.
			int M = scanner.nextInt();

			// 두 번째 줄에는 N개 문서의 중요도 (1 <= 중요도 <= 9)
			// 중요도가 같은 문서가 여러개 있을 수도 있다.
			for (int j = 0; j < N; j++) {
				int importance = scanner.nextInt();
				queue.offer(new int[] { j, importance });
			}

			// poll되는 값을 세는 변수
			int count = 0;
			
			// 무한 반복문으로, M번째 값이 중요도가 가장 높아 poll되면 탈출한다.
			while (true) {
				// 맨 앞의 값이 가장 큰 값인지 확인하는 변수
				boolean isMax = true;
				
				// Queue의 맨 앞 원소보다 큰 값이 있는지 확인하는 반복문 (중요도 체크)
				for (int[] element : queue) {
					if (element[1] > queue.peek()[1]) {
						isMax = false;
						break;
					}
				}

				// queue의 맨 앞 요소가, 중요도가 가장 높을때 poll 해주고,
				// 그 값이 또 M과 같다면, while문을 탈출해준다.
				if (isMax) {
					count++;
					if (queue.poll()[0] == M)
						break;
				} else { // 가장 큰 값이 아니라면, 앞의 값을 맨 뒤로 이동시킨다.
					queue.offer(queue.poll());
				}
			}
			
			// 문서가 몇 번째로 인쇄되는지 출력한다.
			System.out.println(count);
		}
	}
}
