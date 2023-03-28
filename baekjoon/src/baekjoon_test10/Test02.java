/*
 * 24263번
 * Q. 오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자. 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
 * 		MenOfPassion 알고리즘은 다음과 같다.
 * 			MenOfPassion(A[], n) {
 * 				sum <- 0;
 * 				for i <- 1 to n
 * 					sum <- sum + A[i]; # 코드1
 * 				return sum;
 * 			}
 * 입력: 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
 * 출력: 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 * 		둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 */
package baekjoon_test10;
import java.util.*;

public class Test02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		System.out.println(n);
		System.out.println("1");
	}
}


/*
 * 위 문제의 코드 1의 실행횟수는 입력한 값을 1부터 n까지 더해주는 것으로 n번을 실행한다.
 * 수행 시간은 상수 시간이 소요되면 0, n에 비례하면 1, n2에 비례하면 2, n3에 비례하면 3, n3보다 큰 시간에 비례하면 4이다.
 * 알고리즘의 반복문리 한 번만 수행하므로 항상 n만큼의 시간이 소요되고 수행시간은 비례되는 1
 * 따라서 수행 횟수는 n
 * 소요시간은 항상 1
 */
