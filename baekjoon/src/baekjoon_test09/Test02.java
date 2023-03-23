/*
 * 1085번
 * Q. 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 x, y, w, h가 주어진다.
 * 출력: 첫째 줄에 문제의 정답을 출력한다.
 */
package baekjoon_test09;

import java.io.*;
import java.util.*;

public class Test02 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
	
	
		int xlen=0; //x좌표의 최단 거리
		int ylen=0; //y좌표의 최단 거리
		
		if((w-x)>x) { //원점에서 거리 = x, 사각형 끝에서 거리는 (w-x)
			xlen = x;
		}else if((w-x)<x) {
			xlen = (w-x);
		}
		
		if((h-y)>y) { //원점에서 거리 = y, 사각형 끝에서 거리는 (h-y)
			ylen = y;
		}else if((h-y)<y) {
			ylen = (h-y);
		}
		
		if(xlen<ylen) {//x좌표의 최단 거리와  y좌표 최단 거리 비교
			System.out.println(xlen);
		}else {
			System.out.println(ylen);
		}
	
	}
}
