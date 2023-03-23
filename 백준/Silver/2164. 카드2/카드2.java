import java.util.Scanner;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int nArray[] = new int[2*n];
        
        int front = 0;
        int rear = n-1;
        
        for(int i = front; i <=rear; i++){
            nArray[i] = i+1;
        }
        
        for(int i = n; i > 1; i--){
            front++;
            nArray[rear+1] = nArray[front];
            rear++;
            front++;
        }
        
        System.out.println(nArray[front]);

    }
}