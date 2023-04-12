import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int nArray[] = new int[n];
		for(int i = 0; i < n; i++)
			nArray[i] = scanner.nextInt();
	
		Arrays.sort(nArray);
		
		for(int i = 0; i < n; i++)
			System.out.println(nArray[i]);
			
	}
}