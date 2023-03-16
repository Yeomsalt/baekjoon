/*
 * 4344번
 * Q. 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 입력: 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력: 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
package baekjoon_test06;

import java.io.*;
import java.util.*;

public class Test07 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int Case = Integer.parseInt(br.readLine()); //테스트 케이스 수
		
		for(int i =0; i<Case; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken()); // 학생 수
			int[] arr = new int[N];
			
			double sum=0;

			
			for(int j=0; j<N; j++) {
				int val=Integer.parseInt(st.nextToken());
				arr[j]=val;
				sum += val;
			}
			
			double count=0;
			double evg=(sum/N); 
			
			for(int j=0; j<N; j++) {
				if(arr[j]>evg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		
	}
}
