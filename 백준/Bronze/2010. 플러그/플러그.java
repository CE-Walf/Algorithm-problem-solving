import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int sum = 0;
        
        for(int i = 0; i < N ; i++){
            sum += scanner.nextInt();
            if(i != N-1)
                sum--;
        }
        System.out.println(sum);
    }
}