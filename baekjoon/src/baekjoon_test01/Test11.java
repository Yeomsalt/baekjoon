/*
 * 11382번
 * Q. 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 * 입력: 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
 * 출력: A+B+C의 값을 출력한다.
 */
package baekjoon_test01;

import java.util.*;
public class Test11 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		long a, b, c;
		a = in.nextLong();
		b = in.nextLong();
		c = in.nextLong();
		
		System.out.println(a+b+c);
	}
}
