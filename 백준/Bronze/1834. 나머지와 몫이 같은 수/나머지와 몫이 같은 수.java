import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		long sum = 0;
		
		for(long  i = 0; i < N; i++ )
			sum += (N + 1) * i;

		System.out.println(sum);

	}
}