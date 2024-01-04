import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열로 입력받는다.
        String A = sc.next();
        String B = sc.next();

        // 거꾸로된 문자열을 담자.
        String reversedA = "";
        String reversedB = "";

        for (int i = A.length() - 1; i >= 0; i--)
            reversedA = reversedA + A.charAt(i);

        for (int i = B.length() - 1; i >= 0; i--)
            reversedB = reversedB + B.charAt(i);

        // 거꾸로된 문자열을 정수형으로 변환
        int intReversedA = Integer.parseInt(reversedA);
        int intReversedB = Integer.parseInt(reversedB);

        if (intReversedA > intReversedB)
            System.out.println(intReversedA);
        else
            System.out.println(intReversedB);
    }
}

