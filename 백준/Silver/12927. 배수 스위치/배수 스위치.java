import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 전구 상태 입력 받기
        String bulbString = scanner.next();
        // 전구의 개수
        int bulbCount = bulbString.length();
        // 전구의 상태를 담을 boolean 배열 (배열 스위치 알고리즘을 짜는 데 편의를 위해 1칸 더 크게 선언)
        boolean[] bulbStatus = new boolean[bulbCount + 1];
        // 스위치를 누른 횟수를 담는 변수
        int count = 0;

        // boolean 배열에, 현재 전구의 상태를 담는다. Y => true, N => false
        for (int i = 0; i < bulbCount; i++){
            char iBulbStatus = bulbString.charAt(i);
            if (iBulbStatus == 'Y'){
                bulbStatus[i+1] = true;
            } // 굳이 N일때는 설정을 하지 않아도 됨. (기본 값 false)
        }

        // bulbStatus를 순회하면서,
        // i번째의 전구가 Y일때, 그의 배수들은 다 뒤바꿔주고, 그 과정을 끝까지 진행한다.
        for (int i = 1; i <= bulbCount; i++){
            if (bulbStatus[i]){
                for (int j = i; j <= bulbCount; j += i){
                    if (bulbStatus[j]){
                        bulbStatus[j] = false;
                    } else{
                        bulbStatus[j] = true;
                    }
                }
                count += 1;
            }
        }

        System.out.println(count);

    }
}