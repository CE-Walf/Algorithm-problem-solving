import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int nArray[] = new int[21];
        
        nArray[0] = 0;
        nArray[1] = 1;
        
        for(int i = 2 ; i < 21 ; i ++)
            nArray[i] = nArray[i-2] + nArray[i-1]; 

        System.out.println(nArray[n]);
    }
}
