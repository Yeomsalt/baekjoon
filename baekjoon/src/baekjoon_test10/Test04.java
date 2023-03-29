/*
 * 24265번
 * Q.  MenOfPassion(A[], n) {
 * 		   sum <- 0;
 * 		   for i <- 1 to n - 1
 * 				for j <- i + 1 to n
 * 		        	sum <- sum + A[i] × A[j]; # 코드1
 * 		   return sum;
 * 		}
 * 입력: 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
 * 출력: 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 * 		둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 */
package baekjoon_test10;

import java.io.*;

public class Test04 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println((n*(n-1))/2);
		System.out.println("2");
		
	}
}
/*
 * 1번 for문 1~n-1까지
 * 2번 for문 i+i~n까지 
 * n*(n-1)의 합: 수행횟수 가우스의 덧셈을 활용하면 (n*(n-1))/2
 * n^2/2의 최고차항: 2
 */
