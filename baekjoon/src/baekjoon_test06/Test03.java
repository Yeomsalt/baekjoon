/*
 * 2444번
 * Q. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */
package baekjoon_test06;

import java.util.*;

public class Test03 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}				
			for(int k=0; k<(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=(n-1); i>=0; i--) {
			for(int j=0; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i*2-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
