import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int twoCount = 0;
		int fiveCount = 0;
		
		for(int i = 1; i <= N; i++){
		    int temp = i;
		    
		    while(temp % 2 == 0){
		        twoCount++;
		        temp /= 2;
		    }
		    
		   while(temp % 5 == 0){
		        fiveCount++;
		        temp /= 5;
		    }
		}
		
		System.out.println(Math.min(twoCount, fiveCount));
	}
}