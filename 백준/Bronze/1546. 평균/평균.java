import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }

        Arrays.sort(score);
        int M = score[score.length-1];
        double mean = ((double)sum / (M * N)) * 100;

        System.out.println(mean);
    }
}