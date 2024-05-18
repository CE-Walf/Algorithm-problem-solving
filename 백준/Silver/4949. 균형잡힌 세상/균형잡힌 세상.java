import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            // 어차피 한 줄을 다 읽어오므로, 마지막 문자가 .인 것은 신경쓰지 말자.
            String sentence = br.readLine();

            // .만 입력 받았을 경우, 반복문을 탈출해준다.
            // yes, no도 "."만 입력되었을 경우에는, 나오지 않는다.
            if (sentence.equals("."))break;

            // 괄호를 담을 스택이다.
            Stack<Character> parentheses = new Stack<>();
            boolean flag = true; // 반복문 탈출을 위한 flag이다.

            for (int i = 0; i < sentence.length(); i++){
                char temp = sentence.charAt(i);
                // 여는 소괄호, 여는 대괄호일때, 스택에 추가해준다.
                if (temp == '(' || temp ==  '['){
                    parentheses.push(temp);
                }

                // 닫는 소괄호라면, 확인해주고 스택에서 제거해준다.
                if (temp == ')'){
                    // 스택의 마지막 요소 반환하고 그것이 소괄호인지 확인한다.
                    // 스택이 비어있을 상태에서 peek() 메서드 호출 시
                    // NoSuchElementException 예외가 발생하므로, 비어있지 않을때 조건을 추가한다.
                    if (!parentheses.empty() && parentheses.peek() == '('){
                        parentheses.pop();
                    } else {
                        // 여기서 flag를 사용하는 이유는,
                        // 이렇게 하지 않으면, (())))도 올바른 괄호라고 인식하기 때문이다.
                        flag = false;
                        break;
                    }
                }

                if (temp == ']'){ // 닫는 대괄호라면, 확인해주고 스택에서 제거해준다.
                    // 스택의 마지막 요소 반환하고 그것이 대괄호인지 확인한다.
                    // 스택이 비어있을 상태에서 peek() 메서드 호출 시
                    // NoSuchElementException 예외가 발생하므로, 비어있지 않을때 조건을 추가한다.
                    if (!parentheses.empty() && parentheses.peek() == '['){
                        parentheses.pop();
                    } else {
                        // 여기서 flag를 사용하는 이유는,
                        // 이렇게 하지 않으면, (())))도 올바른 괄호라고 인식하기 때문이다.
                        flag = false;
                        break;
                    }
                }
            }

            // 스택이 비어있고, flag가 true라면, 괄호가 올바른 문장이다.
            if(flag && parentheses.empty()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}