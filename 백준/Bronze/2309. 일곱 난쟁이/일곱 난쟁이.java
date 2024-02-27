import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 일곱 난쟁이의 키의 합이 100이다.
        // 모든 난쟁이의 키를 다 더하고, 무작위로 2명의 난쟁이의 키를 빼는데,
        // 그 값이 100이 됬을때를 찾는 방법으로 문제를 풀어보자.

        int n = 9;  // 아홉명의 난쟁이
        int sumOfHeight = 0;    //  9명의 난쟁이의 키의 합을 담는 변수
        int[] heightOfDwarf = new int[n];   // 난쟁이들의 키를 담는 변수
        // 난쟁이들 키 입력하면서, 키의 합 구하기
        for (int i = 0; i < n; i++) {
            heightOfDwarf[i] = scanner.nextInt();
            sumOfHeight += heightOfDwarf[i];
        }


        // 일곱 난쟁이가 아닌 두 명의 난쟁이의 찾기
        int falseDwarf1 = 0;
        int falseDwarf2 = 0;
        boolean breakFlag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sumOfHeight - heightOfDwarf[i] - heightOfDwarf[j] == 100) {
                    falseDwarf1 = heightOfDwarf[i];
                    falseDwarf2 = heightOfDwarf[j];
                    breakFlag = true;
                }
                if (breakFlag){
                    break;
                }
            }
        }

        // 난쟁이 키 담은 배열 정렬
        Arrays.sort(heightOfDwarf);

        // 두명의 난쟁의 키를 제외하고 출력
        for (int i = 0; i < n; i++) {
            if (heightOfDwarf[i] != falseDwarf1 && heightOfDwarf[i] != falseDwarf2) {
                System.out.println(heightOfDwarf[i]);
            }
        }
    }
}