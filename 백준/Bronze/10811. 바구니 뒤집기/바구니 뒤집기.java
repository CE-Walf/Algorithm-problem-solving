import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N+1];
        for(int i = 1; i <= N; i++)
            basket[i] = i;


        for(int i = 0; i < M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int temp = 0;

            while(true){
                if(start >= end)break;

                temp = basket[end];
                basket[end] = basket[start];
                basket[start] = temp;

                start++;
                end--;
            }
        }

        for(int i = 1; i <= N; i++){
            System.out.print(basket[i] + " ");
        }

    }
}