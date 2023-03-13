import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        int temp;
        
        int basket[] = new int[N];
        
        for(int index = 1 ; index <= N ; index++){
            basket[index-1] = index;
        }
        
        for(int index1 = 0; index1 < M; index1++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            temp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = temp;
        }
        for(int index = 0; index < N ; index++)
            System.out.print(basket[index] + " ");
    }
}