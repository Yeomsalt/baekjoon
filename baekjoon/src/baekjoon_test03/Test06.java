/*
 * 15552번
 * Q. BufferedReader와 BufferedWriter를 사용하여 문제해결
 * 입력: 첫 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1이상 1,000이하이다.
 * 출력: 각 테스트케이스마다 A+b를 한 줄에 하나씩 순서대로 출력한다.
 */
package baekjoon_test03;

import java.io.*;

public class Test06 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String s = br.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			bw.write(a+b+"\n");
		}
		bw.flush();
	}
}
