package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019. 01. 07.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/11720
 * Title : 숫자의 합
 * description : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
                 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.
                        둘째 줄에 숫자 N개가 공백없이 주어진다.
                 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다
 * solution : for문 사용.

 */
public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        br.close();

        int answer = 0;
        for(int i=0; i<n; ++i){
           // answer += Integer.parseInt(input.substring(i,i+1));
            answer += input.charAt(i)-'0';
        }
        System.out.println(answer);
    }
}