/*
 * 5073번
 * Q. 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다
 * 		Equilateral :  세 변의 길이가 모두 같은 경우
 * 		Isosceles : 두 변의 길이만 같은 경우
 * 		Scalene : 세 변의 길이가 모두 다른 경우
 * 		단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
 * 입력: 각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.
 * 출력: 각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
*/
package baekjoon_test09;
import java.io.*;
import java.util.*;

public class Test07 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			//종료
			if(a==0&&b==0&&c==0) {
				break;
			}
			
			//가장 긴 변의 길이가 나머지 긴변의 길이보다 작으면 안됨
			int temp;
			if(a<=b && b>=c) {
				temp = b;
				b= a;
				a= temp;
			}else if(a<=c&&c>=b) {
				temp = c;
				c = a;
				a = temp;
			}
			if(a>=(b+c)) {
				System.out.println("Invalid");
			}
			
			//삼각형 형태에 따른 출력
			else if(a==b && b==c) {
				System.out.println("Equilateral");
			}else if(a==b || b==c || c==a) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}
	}
}
