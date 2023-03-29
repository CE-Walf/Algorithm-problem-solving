import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for(int i = N; i >= 4; i--){
            boolean flag = true;
            int temp = i;
            
            while(temp != 0){
                if(temp % 10 == 4 || temp % 10 == 7)
                    temp /= 10;
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
            
        }
    }
}