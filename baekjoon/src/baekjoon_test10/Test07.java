/*
 * 24313번
 * Q. 오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 * 		알고리즘의 소요 시간을 나타내는 O-표기법(빅-오)을 다음과 같이 정의하자.
 * 		O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
 * 		함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.
 * 입력: 첫째 줄에 함수 f(n)을 나타내는 정수 a1, a0가 주어진다. (0 ≤ |ai| ≤ 100)
 * 		다음 줄에 양의 정수 c가 주어진다. (1 ≤ c ≤ 100)  
 * 		다음 줄에 양의 정수 n0가 주어진다. (1 ≤ n0 ≤ 100)
 * 		f(n) = 7n + 7, g(n) = n, c = 8, n0 = 1이다. f(1) = 14, c × g(1) = 8이므로 O(n) 정의를 만족하지 못한다.
 * 출력: f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.
 */
package baekjoon_test10;
import java.io.*;
import java.util.*;

public class Test07 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int answer = 1;
		
		int fn = n1*n+n2;
		int gn = c*n;
		
		if(n1-c != 0) {
			int k = -n2/(n1-c);
			if(n<k) {
				answer =0;
			}
		}
		/*
		 * if(n1>c){
		 * 		System.out.print(0);
		 * 		return;
		 * }
		 */
		
		if(fn>gn) {
			answer=0;
		}
		System.out.println(answer);
	}
}
