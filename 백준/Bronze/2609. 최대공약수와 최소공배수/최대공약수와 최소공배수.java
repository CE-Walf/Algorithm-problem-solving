import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int min = 0;
		int result1 = 0;
		int result2 = 0;
		
		if(a>b)
			min = b;
		else 
			min = a;
		
		//최대공약수
		for(int i = min; i >0 ; i--) {
			if((a % i == 0) && (b % i == 0)) {
				result1 = i;
				break;
			}
		}
		System.out.println(result1); // 최대공약수 출력
		
		//최소공배수
		result2 = result1 * a/result1 * b/result1; 
		System.out.println(result2);
		
	}
}