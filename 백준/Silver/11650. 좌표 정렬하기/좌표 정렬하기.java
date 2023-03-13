import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int coordinate[][] = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			coordinate[i][0] = scanner.nextInt();
			coordinate[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(coordinate, (e1, e2) -> {
			if(e1[0] == e2[0]) 
				return e1[1] - e2[1];
			else 
				return e1[0] - e2[0];
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(coordinate[i][0] + " " + coordinate[i][1]);
		}
	}
}