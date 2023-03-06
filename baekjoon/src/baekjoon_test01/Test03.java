/*
 * 1001번
 * Q. 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 A-B를 출력한다.
 */
package baekjoon_test01;

import java.util.*;
public class Test03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int a, b;
		a= in.nextInt();
		b=in.nextInt();
		int c = a-b;
		System.out.println(c);
	}
}
