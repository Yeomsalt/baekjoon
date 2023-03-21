/*
 * 2738번
 * Q. N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 * 입력: 	첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 * 출력: 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 */
package baekjoon_test07;

import java.io.*;
import java.util.*;

public class Test01 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[][]= new int [n][m];//n*m 크기의 행렬 1
		int arr2[][] = new int [n][m];//행렬 2
		
		for(int i=0; i<n; i++) {//행렬 1의 값 받기
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<m; j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<n; i++) {//행렬 2의 값 받기
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<m; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		for(int i=0; i<n; i++) {//계산
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j]+arr2[i][j]+" ");
				if(j==m-1) {//행렬 첫줄 작성 이후 다음줄로 넘어가기 위해서 마지막 값은 j(0번방부터니까)== m-1이어야 다음줄로 넘어감
					System.out.println();
				}
			}
		}
	
	}
}
