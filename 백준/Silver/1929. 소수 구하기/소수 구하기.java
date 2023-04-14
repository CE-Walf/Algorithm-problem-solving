import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        int[] prime = new int[N+1];
        
        prime[0] = prime[1] = 0;
        
        for(int i = 2; i <= N; i++)
            prime[i] = i;

        for(int i = 2; i < N; i++){
            if(prime[i] == 0)continue;
            for(int j = 2*i; j <= N; j += i)
                prime[j] = 0;
        }
        
        for(int i = M; i <= N; i++)
            if(prime[i] != 0)
                System.out.println(i);
    }
}