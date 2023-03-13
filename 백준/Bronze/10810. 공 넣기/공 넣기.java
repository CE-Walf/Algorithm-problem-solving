import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        int basket[] = new int[N]; 
        
        for(int index = 0; index < N; index++)
            basket[index] = 0;
        
        for(int index1 = 0; index1 < M ; index1 ++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            
            for(int index2 = i-1; index2 <= j-1 ; index2++)
                basket[index2] = k;
        }
        
        
        for(int index = 0; index < N ; index++)
            System.out.print(basket[index] + " ");

    }
}