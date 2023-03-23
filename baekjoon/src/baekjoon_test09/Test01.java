/*
 * 27323번
 * Q. 정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
 * 입력: 첫줄에 A, 다음 줄에 B가 주어진다.
 * 출력: 세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
 */
package baekjoon_test09;
import java.io.*;

public class Test01 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a*b);
		
		//사각형은... 너무.. 쉽..
	}
}
