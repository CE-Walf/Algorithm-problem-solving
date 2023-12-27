import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 주사위 1
        int B = sc.nextInt(); // 주사위 2
        int C = sc.nextInt(); // 주사위 3
        sc.close();

        if(A == B && B == C && C == A){
            // 1. 같은 눈이 3개 나오면 10000 + 1000 * (같은 눈)
            System.out.println(10000 + 1000 * A);
        }
        else if(A != B && B != C && C != A){
            // 3. 다른 눈이 3개 나오면 답은 (가장 큰 눈) * 100
            if (A >= B && A >= C)
                System.out.println(A * 100);
            else if (B >= C)
                System.out.println(B * 100);
            else
                System.out.println(C * 100);
        }
        else{
            // 2. 같은 눈이 2개만 나오는 경우, 1000 + (같은 눈) * 100
            if(A == B)
                System.out.println(1000 + 100 * A);
            else if (B == C)
                System.out.println(1000 + 100 * B);
            else
                System.out.println(1000 + 100 * C);
        }

    }
}