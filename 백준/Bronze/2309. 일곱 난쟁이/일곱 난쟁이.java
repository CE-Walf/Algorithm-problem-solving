import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int nArray[] = new int[9];
        int sum = 0;
        
        for(int i = 0; i < 9; i++){
            nArray[i] = scanner.nextInt();
            sum += nArray[i];
        }
        
        for(int i = 0; i < 8; i++){
            for(int j = 1; j < 9; j++){
                if(sum - nArray[i] - nArray[j] == 100){
                    nArray[i] = 0;
                    nArray[j] = 0;
                    i = 8;
                    break;
                }
           }
        }
        
        Arrays.sort(nArray);
        
        for(int i = 2; i < 9; i++)
            System.out.println(nArray[i]);
    
    }
}