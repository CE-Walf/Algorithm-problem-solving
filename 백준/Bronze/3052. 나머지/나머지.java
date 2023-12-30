import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] remainOf42 = new int[42];
        int count = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            remainOf42[num%42] = 1;
        }

        for(int i = 0; i < 42; i++){
            if(remainOf42[i] == 1)
                count++;
        }

        System.out.println(count);
    }
}