import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int NArray[] = new int[N];
        
        int j = 0;
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                NArray[j] = i;
                j++;
            }
        }
        
        if(j < K)
            System.out.println(0);
        else
            System.out.println(NArray[K-1]);
        
        
        
    }
}