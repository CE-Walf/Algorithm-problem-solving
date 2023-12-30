import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 우선 N개의 바구니를 0으로 초기화
        int[] basket = new int[N];
        for(int i = 0; i < N; i++)
            basket[i] = 0;

        // M번의 공을 넣는 방법
        for(int i = 0; i < M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();
            
            // start번째 바구니부터 end번째 바구니까지 num값 넣기
            for(int j = start-1; j <= end-1; j++)
                basket[j] = num;
        }
        
        // 출력
        for(int i = 0; i < basket.length; i++)
            System.out.print(basket[i] + " ");
    }
}