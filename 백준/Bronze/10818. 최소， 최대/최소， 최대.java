import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int nArray[] = new int[n];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n ;i++)
            nArray[i] = scanner.nextInt();
        
        for(int i = 0; i < n ; i++){
            if(max <= nArray[i])
                max = nArray[i];
            if(min >= nArray[i])
                min = nArray[i];
        }
        
        System.out.println(min + " " + max);
        
        
    }
}