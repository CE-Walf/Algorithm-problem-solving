import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 정수의 개수 입력
        int arrayN [] = new int[N]; // 정수 입력 받기
        for(int i = 0; i < N; i++)
            arrayN[i] = sc.nextInt();
        int v = sc.nextInt();   // 찾으려는 정수

        sc.close();

        int cnt = 0; // v가 arrayN에 들어있는 횟수

        for(int i = 0; i < N; i++)
            if(arrayN[i] == v)  cnt++;

        System.out.println(cnt);

    }
}