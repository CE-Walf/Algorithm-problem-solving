import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i+1; j <= n; j++){
                sum += j;
                if(sum > n)break;
                if(sum == n){
                    count++;
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}