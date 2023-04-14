import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int divisorCount = scanner.nextInt();
		int  divisorArray[] = new int[divisorCount];
		
		for(int i = 0; i < divisorCount; i++) 
			divisorArray[i] = scanner.nextInt();
		
		Arrays.sort(divisorArray);
		
		int min = divisorArray[0];
		int max = divisorArray[divisorCount-1];
		
		System.out.println(min * max);
	}
}