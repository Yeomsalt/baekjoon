/*
 * 3009번
 * Q. 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 * 입력: 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 * 출력: 직사각형의 네 번째 점의 좌표를 출력한다.
 */
package baekjoon_test09;
import java.io.*;
import java.util.*;
public class Test03 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int xarr [] = new int[3]; //x좌표 담을 배열
		int yarr [] = new int[3]; //y좌표 담을 배열
		
		int a=0, b=0; //결과 x,y == a, b
		
		for(int i=0; i<3; i++) {//좌표 3개 받기
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			xarr[i] = x; //배열의 인덱스는 0~2, 각 x값 넣기
			yarr[i] = y; //배열의 인덱스는 0~2, 각 y값 넣기
			
		}
		//두개의 인덱스 값이 같다면 다른 하나가 결과 a,b의 값이 됨
		if(xarr[0]==xarr[1]) { 
			a = xarr[2];
		}else if(xarr[1]==xarr[2]) {
			a = xarr[0];
		}else if(xarr[0]==xarr[2]) {
			a = xarr[1];
		}
		
		if(yarr[0]==yarr[1]) {
			b = yarr[2];
		}else if(yarr[1]==yarr[2]) {
			b = yarr[0];
		}else if(yarr[0]==yarr[2]) {
			b = yarr[1];
		}
		
		System.out.print(a+" "+b);
	}
	
}
