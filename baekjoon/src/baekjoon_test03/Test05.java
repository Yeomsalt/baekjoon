/*
 * 25314번
 * Q. 입출력이 N바이트 크기의 정수라면 프로그램을 어떻게 구현해야 하는가. long int 는 4바이트 정수까지 저장할 수 있다.
 * 	정수 자료형이고 long long int 는 8바이트 정수까지 저장할 수 있다. int 앞에 long을 하나씩 더 붙일 때만다 4바이트씩 저장공간이 늘어난다면 N바이트 정수까지 저장할 수 있는 자료형의 이름은?
 * 입력: 첫 번째 줄에는 문제의 정수 N이 주어진다.(4<= N <=1000; N은 4의 배수)
 * 출력: N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력
 */
package baekjoon_test03;

import java.util.*;

public class Test05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String k = "long";
		
		for(int i = 1; i<=n/4; i++) {
			System.out.print(k+" ");
		}
		System.out.print("int");
	}
}
