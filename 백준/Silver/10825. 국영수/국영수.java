import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    public String name; // 이름
    public int korean; // 국어 성적
    public int english; // 영어 성적
    public int math; // 수학 성적


    // 생성자로 개체 받기
    Student (String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    // this가 object보다 작으면 음수, 크면 양수를 반환. 이를 통해 정렬
    // 내림차순 : return object - this
    // 오름차순 : return this - object
    public int compareTo(Student object){
        if (this.korean  == object.korean){
            if (this.english == object.english){
                if (this.math == object.math){
                    return this.name.compareTo(object.name);
                }
                return object.math - this.math;
            }
            return this.english - object.english;
        }
        return object.korean - this.korean;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // N명의 학생

        Student[] students = new Student[N]; // 객체 배열 생성
        for (int i = 0; i < N; i++){
            String name = scanner.next();
            int korean = scanner.nextInt();
            int english = scanner.nextInt();
            int math = scanner.nextInt();
            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }

    }
}