import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int Array[] = new int[1000];
        int sum = 0;
        int cnt = 0;
        
       for(int i = 1; i <= 1000; i++){
           for(int j = 0; j < i; j++){
               if(cnt == 1000)
                    break;
               Array[cnt] = i;
               cnt++;
           }
       }

       for(int i = A; i <= B; i++)
            sum += Array[i-1];
       
        System.out.println(sum);
    }
}