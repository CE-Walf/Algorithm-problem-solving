// 1974. 스도쿠 검증
// 난이도 : D2

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    static int[][] sudoku; // 스도쿠를 static으로 선언
    static int[] checkArr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 비교 대상 배열

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 갯수 입력 받기

        // 9 x 9 스도쿠를 T개 입력 받는다.
        for (int test_case = 1; test_case <= T; test_case++) {

            // 9x9 이차원 배열에 스도쿠를 입력 받자.
            sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = scanner.nextInt();
                }
            }

            // 이제 그 스도쿠가 맞는지 검증해 보자.
            // 스도쿠는 가로, 세로, 그리고 3x3 공간에 1,2,3,4,5,6,7,8,9 9개의 숫자가 존재해야 한다.
            boolean flag_width = checkWidth();
            boolean flag_height = checkHeight();
            boolean flag_3x3 = check3x3();

            int answer;

            if (flag_width && flag_height && flag_3x3) {
                answer = 1;
            } else {
                answer = 0;
            }


            // 1이면 정답, 0이면 오답
            System.out.println("#" + test_case + " " + answer);
        }
    }

    // 가로를 체크한다.
    static boolean checkWidth() {
        // 가로줄에 있는 것들을 체크
        for (int i = 0; i < 9; i++) {
            int[] temp = new int[9]; // 가로줄을 담을 임시 배열
            //  i번째 행의 sudoku 값을 temp 배열에 담아준다.
            for (int j = 0; j < 9; j++) {
                temp[j] = sudoku[i][j];
            }
            Arrays.sort(temp); // 정렬

            // checkArr의 원소들과 비교하여 틀릴경우 바로 false를 반환한다.
            for (int j = 0; j < 9; j++) {
                if (temp[j] != checkArr[j])
                    return false;
            }

        }
        // 다 통과하고 다 성립하면 true 반환
        return true;
    }

    static boolean checkHeight() {
        // 세로줄에 있는 것
        for (int i = 0; i < 9; i++) {
            int[] temp = new int[9]; // 세로줄을 담을 임시 배열

            //  j번째 열의 sudoku 값을 temp 배열에 담아준다.
            for (int j = 0; j < 9; j++) {
                temp[j] = sudoku[j][i];
            }

            Arrays.sort(temp); // 정렬

            // checkArr의 원소들과 비교하여 틀릴경우 바로 false를 반환한다.
            for (int j = 0; j < 9; j++) {
                if (temp[j] != checkArr[j])
                    return false;
            }

        }
        // 다 통과하고 다 성립하면 true 반환
        return true;
    }

    static boolean check3x3() {
        // 3x3 부분의 원소들을 담아야한다.
        // [0][0] ~ [2][2], [0][3] ~ [2][5], [0][6] ~ [2][8]
        // [3][0] ~ [5][2], [3][3] ~ [5][5], [3][6] ~ [5][8]
        // [6][0] ~  [8][2], [6][3] ~ [8][5], [6][6] ~ [8][8]
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int[] temp = new int[9];
                int index = 0;

                // 4중 반복문?!?!?!
                for (int k = 0; k < 3; k++){
                    for (int l = 0; l < 3; l++){
                        temp[index++] = sudoku[i * 3 + k][j * 3 + l];
                    }
                }

                Arrays.sort(temp); // 정렬

                // checkArr의 원소들과 비교하여 틀릴경우 바로 false를 반환한다.
                for (int k = 0; k < 9; k++) {
                    if (temp[k] != checkArr[k])
                        return false;
                }
            }
        }
        // 다 통과하고 다 성립하면 true 반환
        return true;
    }
}