/*
 * 27866번
 * Q. 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
 * 		둘쨰 둘에 정수 i가 주어진다.(1<=i<=|S|)
 * 출력: S의 i번째 글자를 출력한다.
 */
package baekjoon_test05;

import java.io.*;
import java.util.*;

public class Test01 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		String result = s.substring(i-1,i);
		System.out.print(result);
	}
}
