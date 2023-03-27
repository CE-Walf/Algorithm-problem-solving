import java.util.Scanner;

public class Main{
    
    public static int gcd(int A, int B){
        int max = Math.max(A,B);
        int result = 1;
        
        for(int i = max; i >= 2; i--){
            if(A % i == 0 && B % i == 0){
                result = i;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for(int i = 0; i < T; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            int ABgcd = gcd(A,B);
            
            System.out.println(ABgcd * A/ABgcd * B/ABgcd);
        }
    }
}