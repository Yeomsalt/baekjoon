/*
 * 1978번
 * Q. 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입력: 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다
 * 출력: 주어진 수들 중 소수의 개수를 출력한다.
 */
package baekjoon_test08;
 
import java.io.*;
import java.util.*;
 
public class Test04 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count=0;
		int a;
		for(int i=0; i<n; i++) {
			a = Integer.parseInt(st.nextToken());
			
			for(int j=2; j<=a; j++) {//0과 1은 소수가 아님 2부터 시작
				if(j == a) {
					count++;
				}
				if(a%j == 0) {
					break;
				}
			}
			
		}
		System.out.print(count);
	}
}
