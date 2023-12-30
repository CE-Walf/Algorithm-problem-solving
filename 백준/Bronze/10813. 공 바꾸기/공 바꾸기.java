import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // N번째 바구니에 N을 대입하며 초기화
        int[] basket = new int[N+1];
        for(int i = 1; i <= N; i++)
            basket[i] = i;

        // M번 공을 교환
        for(int i = 0; i < M; i++){
            int exchangeI = sc.nextInt();
            int exchangeJ = sc.nextInt();
            int temp = 0; // 바꾸어주기 위한 임시 변수

            temp = basket[exchangeJ];
            basket[exchangeJ] = basket[exchangeI];
            basket[exchangeI] = temp;
        }

        //출력
        for(int i = 1; i <= N; i++)
            System.out.print(basket[i] + " ");
    }
}