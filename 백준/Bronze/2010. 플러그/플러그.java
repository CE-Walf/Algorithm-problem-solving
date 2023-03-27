import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int NArray[] = new int[N];
        int sum = 0;
        
        for(int i = 0; i < N ; i++){
            NArray[i] = scanner.nextInt();
            sum += NArray[i];
            if(i != N-1)
                sum--;
        }
        System.out.println(sum);
    }
}