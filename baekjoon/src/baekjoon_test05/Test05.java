/*
 * 11720번
 * Q. N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 출력: 입력으로 주어진 숫자 N개의 합을 출력한다.
 */
package baekjoon_test05;

import java.io.*;

public class Test05 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String num = br.readLine();
		String arr[] = num.split("");
		
		int sum =0;
		for(int i=0; i<n; i++) {
		sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
