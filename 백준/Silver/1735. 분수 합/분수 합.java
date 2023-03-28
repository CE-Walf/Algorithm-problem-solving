import java.util.Scanner;

public class Main {
    
    public static int getGcd(int a, int b){
        if(a % b == 0)
            return b;
        else
            return getGcd(b, a % b);
    }
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A[] = new int[2];
		int B[] = new int[2];
		
		for(int i = 0; i < 2; i++){
		    A[i] = scanner.nextInt();
		    B[i] = scanner.nextInt();
		}
		
		int A2 = A[0]*B[1]+A[1]*B[0];
		int B2 = B[0]*B[1];
		
		int gcd = getGcd(A2,B2);
		
		System.out.println(A2/gcd + " " + B2/gcd);
		
	}
}