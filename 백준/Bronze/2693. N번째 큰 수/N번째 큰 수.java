import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int Test = scanner.nextInt();
        int tArray[] = new int[10];
        
        for(int i = 0; i < Test ; i++){
            for(int j = 0; j < 10 ; j++){
                tArray[j] = scanner.nextInt();
            }
            Arrays.sort(tArray);
            System.out.println(tArray[7]);
        }
    
    }
}