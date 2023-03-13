import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        char Array[] = scanner.nextLine().toCharArray();
        
        Arrays.sort(Array);
        
        for(int i = Array.length-1; i >= 0; i--)
            System.out.print(Array[i]);
    }
    
}