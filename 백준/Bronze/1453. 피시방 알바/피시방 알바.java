import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int count = 0;
        boolean comArray[] = new boolean[101];
        int nArray[] = new int[n];
        
        for(int i = 0; i < n; i++){
            nArray[i] = scanner.nextInt();
            if(comArray[nArray[i]] == true){
                count++;
                continue;
            }
            comArray[nArray[i]] = true;
        }
        System.out.println(count);
    }
}