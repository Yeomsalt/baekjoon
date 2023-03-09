/*
 * 10951번
 * Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
 */
package baekjoon_test03;

import java.io.*;

public class Test12 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		while((s=br.readLine())!=null) {
			int a = Integer.parseInt(s.split(" ")[0]); 
			//int a = s.charAt(0)-48;
			int b = Integer.parseInt(s.split(" ")[1]);
			//int b = s.charAt(2)-48;
			sb.append(a+b).append("\n");
		}
		System.out.print(sb);
		
	}
}
