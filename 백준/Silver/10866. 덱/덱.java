import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main{
    // Deque을 ArrayList로 구현하자. 
    // 그리고 static 접근 제어자로 선언하자.
    static ArrayList<Integer> deque  = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 명령의 수
        int N = Integer.parseInt(br.readLine());

        // 명령의 수만큼 반복문 시작.
        for (int i = 0; i < N; i++){
            // 한 줄을 읽어온다.
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 첫 번째 원소는 명령이다.
            String command = st.nextToken();

            // push할때, x의 값
            int x = 0;

            // switch문 으로 구현해보자.
            switch(command){
                case "push_front":
                    x = Integer.parseInt(st.nextToken());
                    f_push_front(x);
                    break;
                case "push_back":
                    x = Integer.parseInt(st.nextToken());
                    f_push_back(x);
                    break;
                case "pop_front":
                    f_pop_front();
                    break;
                case "pop_back":
                    f_pop_back();
                    break;
                case "size":
                    f_size();
                    break;
                case "empty":
                    f_empty();
                    break;
                case "front":
                    f_front();
                    break;
                case "back":
                    f_back();
                    break;
            }
        }

    }

    // 정수 X를 덱의 앞에 넣는다.
    static void f_push_front(int x){
        deque.add(0, x);
    }

    // 정수 X를 덱의 뒤에 넣는다.
    static void f_push_back(int x){
        deque.add(x);
    }

    // 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.
    // 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    static void f_pop_front(){
        if (deque.isEmpty()){
            System.out.println(-1);
        } else {
            System.out.println(deque.remove(0));
        }
    }

    // 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다.
    // 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    static void f_pop_back(){
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.remove(deque.size() - 1));
        }
    }

    // 덱에 들어있는 정수의 개수를 출력한다.
    static void f_size(){
        System.out.println(deque.size());
    }

    // 덱이 비어있으면 1을, 아니면 0을 출력한다.
    static void f_empty(){
        System.out.println(deque.isEmpty() ? 1 : 0);
    }

    // 덱의 가장 앞에 있는 정수를 출력한다.
    // 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    static void f_front(){
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.get(0));
        }
    }

    // 덱의 가장 뒤에 있는 정수를 출력한다. 
    // 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    static void f_back(){
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.get(deque.size() - 1));
        }
    }
}