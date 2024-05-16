// HashMap을 사용하여 풀어보자.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


import java.util.HashMap;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException {
        // BufferReader로 입력을 받자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter로 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // HashMap 선언
        HashMap<Integer, Integer> cardMap = new HashMap<>();

        // 입력 받기
        // 상근이가 가지고 있는 숫자카드 N (1 <= N <= 500,000)
        int N = Integer.parseInt(br.readLine());
        // 숫자 카드에 적혀있는 N개의 정수들을 <정수, count>로 담는다.
        StringTokenizer cardSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(cardSt.nextToken());
            cardMap.put(num, cardMap.getOrDefault(num, 0) + 1);
        }

        // 찾을 값의 갯수를 담은 변수 M (1 <= M <= 500,000)
        int M = Integer.parseInt(br.readLine());
        // 찾을 값들이 무엇인지 찾는다.
        StringTokenizer findSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int findNum = Integer.parseInt(findSt.nextToken());
            bw.write(cardMap.getOrDefault(findNum, 0) + " ");
        }

        bw.flush();
        bw.close();
    }
}