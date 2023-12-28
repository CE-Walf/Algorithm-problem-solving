import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int Array[] = new int[N];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			Array[i] = scanner.nextInt();

			if (max <= Array[i])
				max = Array[i];
			if (min >= Array[i])
				min = Array[i];
		}
		
		System.out.println(min + " " + max);

	}
}