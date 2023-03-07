/*
 * 2753번
 * Q. 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 * 	윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다. 예를 들어 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
 * 	1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년은 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 * 입력: 첫째 줄에 연도가 주어지다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 * 출력: 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 */
package baekjoon_test02;

import java.util.*;

public class Test03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		
		if(year%4==0) {
			if(year%400==0) {
				System.out.println("1");
			}else if(year%100==0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}else {
			System.out.println("0");
		}
	}
}
