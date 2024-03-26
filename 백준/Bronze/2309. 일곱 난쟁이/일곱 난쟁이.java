import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 아홉 난쟁이가 있는데, 이중 둘은 가짜이며, 일곱 난쟁이의 키의 합은 100이다.
        // 그 일곱난쟁이의 키를 오름차순으로 출력하여 주면 된다.

        // 아홉 난쟁이들의 키를 담을 배열을 선언헌다.
        int[] dwarfHeight = new int[9];
        // 아홉 난쟁이의 키를 더한 값을 담는 변수
        int sum = 0 ;

        // 아홉개의 줄에 걸쳐 난쟁이들의 키가 주어진다.
        for (int i = 0; i < 9; i++){
            dwarfHeight[i] = Integer.parseInt(br.readLine());
            sum += dwarfHeight[i];
        }

        // 아홉 난쟁이 배열을 정렬시켜준다.
        Arrays.sort(dwarfHeight);

        // 여기서 중요한 것은, 아홉 난쟁이의 키의 합 - 가짜 두명 난쟁이의 키 = 100이라는 것이다.
        int notDwarf1 = 0;
        int notDwarf2 = 0;
        for (int i = 0; i < 8; i++){
            for (int j = i+1; j < 9; j++){
                if (sum - (dwarfHeight[i] + dwarfHeight[j]) == 100){
                    notDwarf1 = dwarfHeight[i];
                    notDwarf2 = dwarfHeight[j];
                }
            }
        }

        // 출력
        for (int i : dwarfHeight) {
            if(i != notDwarf1 && i != notDwarf2){
                System.out.println(i);
            }
        }

    }
}