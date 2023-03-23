import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int totalWeight = scanner.nextInt();
        int nWeight[] = new int[n];
        int cnt = 0;
        
        for(int i = 0; i < n; i++)
            nWeight[i] = scanner.nextInt();
            
        for(int i =0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(nWeight[i] + nWeight[j] == totalWeight){
                    cnt++;
                }
            }
        }
         System.out.println(cnt);      
               
    }
}