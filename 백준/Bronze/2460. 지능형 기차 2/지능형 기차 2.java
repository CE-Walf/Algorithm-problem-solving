import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int outArray[] = new int[10];
        int inArray[] = new int[10];
        
        int inTrain = 0;
        int max = 0;
        
        for(int i = 0; i < 10; i++){
            outArray[i] = scanner.nextInt();
            inArray[i] = scanner.nextInt();
            inTrain = inTrain - outArray[i] + inArray[i];
            if(max <= inTrain)
                max = inTrain;
        } 
        System.out.println(max);    
    }
}