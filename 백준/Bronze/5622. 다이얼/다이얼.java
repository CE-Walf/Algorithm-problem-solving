import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int time = 0;

        for(int i = 0; i < word.length(); i++){
            char alphabet = word.charAt(i);

            // 알파벳에 따른 숫자
            if (alphabet <= 'C')
                time += 3;
            else if (alphabet <= 'F'){
                time += 4;
            } else if (alphabet <= 'I'){
                time += 5;
            } else if (alphabet <= 'L'){
                time += 6;
            } else if (alphabet <= 'O'){
                time += 7;
            } else if (alphabet <= 'S'){
                time += 8;
            } else if (alphabet <= 'V'){
                time += 9;
            } else if (alphabet <= 'Z'){
                time += 10;
            }
        }
        System.out.println(time);

    }
}

