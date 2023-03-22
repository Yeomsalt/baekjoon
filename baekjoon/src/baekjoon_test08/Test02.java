/*
 * 2501번
 * Q. 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
 * 		두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.
 * 출력: 첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
 */
package baekjoon_test08;

import java.io.*;
import java.util.*;

public class Test02 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int arr[] = new int [n+1];
		int index = 1;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				arr[index] = i;
				index++;
			}
		}
		if(arr[k] != 0) {
			System.out.print(arr[k]);
		}else if(arr[k] == 0) {
			System.out.print(0);
		}
	}
}
