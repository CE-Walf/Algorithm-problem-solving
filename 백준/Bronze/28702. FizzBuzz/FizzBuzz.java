import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한번 더 풀기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        // FizzBuzz 패턴은 15씩 반복된다.
        // 그 패턴에서 3개의 문자열 안에 숫자가 없을 확률은 없다.
        // 숫자를 찾고, 더해주는 방식으로 진행하자.
        if (isNumericStr(s1)){
            System.out.println(fizzBuzz(Integer.parseInt(s1) + 3));
        } else if (isNumericStr(s2)){
            System.out.println(fizzBuzz(Integer.parseInt(s2) + 2));
        } else if (isNumericStr(s3)){
            System.out.println(fizzBuzz(Integer.parseInt(s3) + 1));
        }

    }

    public static boolean isNumericStr(String str) {
        boolean isNumeric = true;

        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                isNumeric = false;
                break;
            }
        }
        return isNumeric;
    }

    public static String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}