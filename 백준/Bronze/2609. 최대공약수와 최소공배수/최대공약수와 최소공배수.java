import java.util.Scanner;

public class Main{
	static int getGCD(int a, int b) {
		if(b == 0)
			return a;
		else
			return getGCD(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int abGCD = getGCD(a,b);
		int abLCM = abGCD * (a/abGCD) *(b/abGCD);
		
		System.out.println(abGCD);
		System.out.println(abLCM);
		
	}
}