import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int sum = 0;
        int lowXY = Math.min(X,Y);
        
        if(A + B <= C * 2){
            sum = A*X + B*Y;
        }
        else{
            if(X == lowXY){
                sum += X * C * 2;
                sum += (Y - X) * Math.min(B , C*2);
            }
            else if(Y == lowXY){
                sum += Y * C * 2;
                sum += (X - Y) * Math.min(A, C*2);
            }
        }
        System.out.println(sum);
    }
}