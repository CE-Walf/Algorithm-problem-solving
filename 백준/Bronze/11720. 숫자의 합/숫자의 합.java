import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		
		String  number = scanner.next();
		
		char carray[] = new char [n];
		
		int sum=0;
		
		for (int i = 0; i < n; i++) {
			carray[i] = number.charAt(i);
			sum += ((int)carray[i]-48);
		}

		System.out.println(sum);
	}
}
