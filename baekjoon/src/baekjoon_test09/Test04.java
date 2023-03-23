/*
 * 15894번
 * Q. "한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다. 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."
 * 		가장 아랫부분의 정사각형 개수가 주어지면 그에 해당하는 답을 출력하는 프로그램을 만들어 형석이를 도와주자!
 * 입력: 첫 번째 줄에 가장 아랫부분의 정사각형 개수 n이 주어진다. (1 ≤ n ≤ 10^9)
 * 출력: 첫 번째 줄에 형석이가 말해야 하는 답을 출력한다.
 */
package baekjoon_test09;

import java.io.*;

public class Test04 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		// 가장 아래 사각형이 1개면 위변=1, 아랫변=1, 좌우 각각=1  == 1*4
		// 가장 아래 사각형이 2개면 위변=2, 아랫변=2, 좌우 각각=2  == 2*4
		// 가장 아래 사각형이 3개면 위변=3, 아랫변=3, 좌우 각각=3  == 3*4
		//따라서 n에다가 4를 곱
		//n이 10의 9승까지라서 타입을 long으로
		
		System.out.println((long)4*n);
	}
}
