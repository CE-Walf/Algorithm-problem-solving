import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Array[] = new int[N+1];
        int temp;
        
        for(int index = 1; index <= N; index++)
            Array[index] = index;
        
        for(int index = 0; index < M; index++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            while(i<j){
                temp = Array[i];
                Array[i] = Array[j];
                Array[j] = temp;
                i++;
                j--;
            }
        }
        
        for(int index = 1; index <= N; index++)
            System.out.print(Array[index] + " ");

    }
}