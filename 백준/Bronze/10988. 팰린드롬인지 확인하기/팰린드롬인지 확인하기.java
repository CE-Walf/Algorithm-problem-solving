import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        boolean flag = false;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println(0);
        } else {
            System.out.println(1);
        }


    }
}