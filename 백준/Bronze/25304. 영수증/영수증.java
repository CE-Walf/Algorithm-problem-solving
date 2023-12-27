import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // 영수증에 적힌 총 금액
        int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
        int sumN = 0; // 물건들의 가격의 합 (영수증에 적혀있는 총 금액과 비교 위해)

        // 영수증의 정보 입력 받기
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sumN += a * b;
        }

        // 영수증 금액과, 물건 가격의 합이 맞는지 확인
        if(sumN == X)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}