import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// T : 테스트 케이스의 수
		int T = Integer.parseInt(br.readLine());
		
		// 1부터 100까지의 P(N)을 저장하는 배열
		// int 타입의 최대값은 2,147,483,647인데,
		// P[100]의 경우, 888,855,064,897 이므로 long타입으로 선언한다.
		long[] P = new long[101];
		
		// 기저조건 설정
		P[1] = 1;
		P[2] = 1;
		P[3] = 1;
		P[4] = 2;
		P[5] = 2;
		
		// 문제의 규칙으로 P배열을 채워준다.
		// P(N) = P(N-1) + P(N-5)
		for (int i = 6; i <= 100; i++) {
			P[i] = P[i-1] + P[i-5];
		}
		
		// 각 테스트 케이스에 대해 P(N)을 출력
		for (int test_case = 0; test_case < T; test_case++) {
			// 1 <= N <= 100
			int N = Integer.parseInt(br.readLine());
			System.out.println(P[N]);
		}
		
	}
}