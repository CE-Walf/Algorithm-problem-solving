import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int[] alphabet = new int[26];
        for(int i = 0; i < alphabet.length; i++)
            alphabet[i] = -1;

        for(int i = 0; i < S.length(); i++){
            int index = S.charAt(i) - 'a';
            if(alphabet[index] == -1)
                alphabet[index] = i;
        }

        for(int i = 0; i < alphabet.length; i++)
            System.out.print(alphabet[i] + " ");
    }
}