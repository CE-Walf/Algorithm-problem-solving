// Queue를 사용하여 문제를 풀어보자.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>(); // 큐 객체 생성

        int N = scanner.nextInt();
        int answer;

        // Queue에 입력
        for (int i = 1;i <= N; i++){
            queue.add(i);
        }

        // 작업 수행 (하나 있을때까지)
        while(true){
            if(queue.size() == 1){
                answer = queue.remove();
                break;
            }
            queue.remove();
            queue.add(queue.remove());
        }

        System.out.println(answer);
    }
}