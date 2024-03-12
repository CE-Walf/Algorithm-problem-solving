import java.util.Scanner;

public class Main{
    static int n, r; // nPr
    static boolean[] isVisited; // 방문한 숫자인지 담는 배열
    static int[] intArr; // n개에서 r번 순서대로 뽑아낸 것을 하나 담는 배열

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 여기서 생각해야 할 부분은, n! = nPn이라는 것이다.
        n = scanner.nextInt(); // n!를 입력 받는다.
        r = n;

        isVisited = new boolean[n]; // 방문한 곳을 담는 배열
        intArr = new int[n]; // 숫자를 담는 배열

        printPermutation(0);
    }

    static void printPermutation(int rCount){
        if (r == rCount){ // r번 다 돌았다면, 출력
            for (int i = 0; i < n; i++){
                System.out.print(intArr[i] + " "); // 배열 출력
            }
            System.out.println(); // 줄바꿈
            return;
        }

        for (int i = 0; i < n; i++){
            if(!isVisited[i]){  // 만약 방문하지 않은 배열이면,
                intArr[rCount] = i + 1;
                isVisited[i] = true;
                printPermutation(rCount+1);
                isVisited[i] = false;
            }
        }
    }
}