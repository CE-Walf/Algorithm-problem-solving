import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine(); // 다솜이의 방 번호를 입력 받는다.
        int[] number = new int[10]; // 0 ~ 9 까지 담을 변수

        // 해당 하는 숫자의 인덱스에 1을 올려준다.
        for (int i = 0; i < N.length(); i++) {
            number[(int) (N.charAt(i) - '0')]++;
        }

        // 최댓값을 두개 구해준다.
        // 1. 6과 9를 제외하고, 그 중에서 가장 많이 나온 수를 뽑는다. => max1
        // 2. 6과 9의 합을 구하는데, 이게 홀수일 경우, 2로 나누고 1을 더해주고, 짝수일 경우 2로 나누어 주기만한다. 
        
        // 1. max1 구하기.
        int max1 = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) {
                continue;
            }

            if (max1 < number[i]) {
                max1 = number[i];
            }
        }
        
        // 2. max2 구하기.
        int max2 = number[6] + number[9];
        if (max2 % 2 == 1) {
            max2 = max2 / 2 + 1;
        } else {
            max2 = max2 / 2;
        }
        
        // max1과 max2중 큰 값을 max에 담는다.
        int max = Math.max(max1, max2);

        // 출력
        System.out.println(max);
    }
}