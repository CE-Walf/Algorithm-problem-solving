import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // N // 4 만큼, 앞에 "long" 붙여주기
        for(int i = 0; i < N / 4; i++)
            System.out.print("long ");

        // 마지막에 "int" 출력
        System.out.println("int");

    }
}