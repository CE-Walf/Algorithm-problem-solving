import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] student = new int[31]; // 총 30명의 학생
        for(int i = 1; i <= 28; i++){ // 특별 과제 한 사람 입력
            int index = sc.nextInt();
            student[index] = 1;
        }

        // 과제를 하지 않은사람 출력
        for(int i = 1; i <= 30; i++){
            if(student[i] == 0)
                System.out.println(i);
        }
        
    }
}