import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 기타의 개수
        // 기타의 시리얼 넘버를 담을 변수
        String[] serialNum = new String[N];
        for (int i = 0; i < N; i++){ // 문자열 배열에 이를 입력받는다.
            serialNum[i] = scanner.next();
        }

        // 정렬 기준 정하면서, 정렬해준다.
        Arrays.sort(serialNum, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i = 0; i < o1.length(); i++){
                        if (Character.isDigit(o1.charAt(i))){
                            sum1 += (int)o1.charAt(i) - '0';
                        }
                    }
                    for (int i = 0; i < o2.length(); i++){
                        if (Character.isDigit(o2.charAt(i))){
                            sum2 += (int)o2.charAt(i) - '0';
                        }
                    }
                    if (o1.length() == o2.length() && sum1 == sum2){
                        // o1과 o2의 길이가 같고, 모든 자리수의 합도 같을 경우,
                        // 사전순으로 비교한다.
                        return o1.compareTo(o2);
                    }
                    // o1과 o2의 길이가 같을 경우,
                    // A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다.
                    return sum1 - sum2;
                }
                // o1과 o2의 길이가 다르면 짧은 것이 먼저온다.
                return o1.length() - o2.length();
            }
        });

        // 출력
        for (String s : serialNum) {
            System.out.println(s);
        }

    }
}