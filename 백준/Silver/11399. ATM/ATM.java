import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int nArray[] = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            nArray[i] = scanner.nextInt();
        }
        Arrays.sort(nArray);
        
        int j = n;
        for(int i = 0; i < n; i++){
                sum += nArray[i] * j;
                j--;
        }
        
        System.out.println(sum);
    }
}