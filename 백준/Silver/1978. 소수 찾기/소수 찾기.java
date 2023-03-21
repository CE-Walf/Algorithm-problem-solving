import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); // n을 입력 받는다.
		int array[] = new int [n];//n개의 배열 생성
		int count[] = new int[n];
		int result = 0;

		for(int i = 0; i<n;i++ )
			array[i] = scanner.nextInt(); //n개의 배열안에 수 입력
		
		scanner.close();
		
		for(int i = 0; i< n; i++) {
			for(int j = 1; j <=array[i]; j++)
				if(array[i]%j == 0)
					count[i] += 1;
		}
		
		for(int i =0; i<n;i++)
			if(count[i] == 2)
				result ++;
		
		System.out.println(result);
	}

}
