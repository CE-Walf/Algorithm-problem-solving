import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 현재 시각 - 시
        int B = sc.nextInt(); // 현재 시각 - 분

        int C = sc.nextInt(); // 요리하는데 걸리는 시간

        // 전부 다 분으로 만들기
        int sumMinute = A * 60 + B + C;

        int hour = (sumMinute / 60) % 24;
        int minute = sumMinute % 60;

        System.out.println(hour + " " + minute);
    }
}