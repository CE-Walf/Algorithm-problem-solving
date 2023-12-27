import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        // 45분 일찍 알람 설정하기
        if (minute >= 45)
            minute = minute - 45;
        else {
            minute = 15 + minute;
            hour -= 1;
            if (hour < 0)
                hour = 23;
        }
        System.out.println(hour + " " + minute);

    }
}