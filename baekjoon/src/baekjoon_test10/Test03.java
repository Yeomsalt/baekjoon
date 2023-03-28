/*
 * 24264번
 * Q. MenOfPassion(A[], n) {
 * 		sum <- 0;
 * 		for i <- 1 to n
 * 			for j <- 1 to n
 * 				sum <- sum + A[i] × A[j]; # 코드1
 * 		return sum;
 * 	}
 * 입력: 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
 * 출력: 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 * 		둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 */
package baekjoon_test10;
import java.util.*;

public class Test03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		System.out.println(n*n);
		System.out.println("2");
	}
}

/*
 * 위 함수에서 2중 for문으로 되어 있으므로 (입력 받은 횟수의 제곱 만큼)
 * n^2이므로 n*n
 * 시간 복잡도는 상수 시간이 소요되기 때문에 o(n^2) -- 2
 * n의 범위는  1부터 500,000이 되므로 제곱시에 int를 넘어가서 long타입으로
 */
