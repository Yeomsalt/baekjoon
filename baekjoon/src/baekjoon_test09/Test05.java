/*
 * 9063번
 * Q. “ 6.25 이전의 개인소유 대지들은 99%가 남북, 동서 방향으로 평행한 직사각형 모양이었으므로, 임씨의 이름이 새겨진 옥구슬이 나오는 모든 지점을 포함하는 가장 작은 남북, 동서 방향으로 평행한 변을 갖는 직사각형의 대지를 임씨의 소유로 인정한다.” 임씨는 많은 손해를 보는 셈이지만 더 이상을 요구할 만한 근거가 없었기 때문에 이 판결을 따르기로 했다.
 * 		임씨의 이름이 새겨진 옥구슬의 위치 N 개가 주어질 때에, 임씨에게 돌아갈 대지의 넓이를 계산하는 프로그램을 작성하시오. 단, 옥구슬의 위치는 2 차원 정수 좌표로 주어지고 옥구슬은 같은 위치에 여러 개가 발견될 수도 있으며, x 축의 양의방향을 동쪽, y 축의 양의방향을 북쪽이라고 가정한다. 
 * 		예를 들어 위와 같이 (2, 1), (3, 2), (5, 2), (3, 4) 네 점에서 옥구슬을 발견하였다면, 임씨에게 돌아갈 대지는 (2, 1), (5, 1), (2, 4), (5, 4)를 네 꼭짓점으로 하는 직사각형이며, 넓이는 (5 - 2) × (4 - 1) = 9 가 된다.
 * 입력: 첫째 줄에는 점의 개수 N (1 ≤ N ≤ 100,000) 이 주어진다. 이어지는 N 줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다. 각각의 좌표는 -10,000 이상 10,000 이하의 정수이다. 
 * 출력: 첫째 줄에 N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력하시오. 
 */
package baekjoon_test09;

import java.io.*;
import java.util.*;

public class Test05 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
	
		int xarr[] = new int[n];
		int yarr[] = new int[n];
		
		//좌표의 최대, 최소 범위가 나타났으므로..
//		int xMax = -10000;
//		int yMax = -10000;
//		int xMin = 10000;
//		int yMin = 10000;
		
		//만들어질 사각형의 가로, 세로
		int w=0, h=0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			xarr[i] = x;
			yarr[i] = y;
		
		}	
		
		//범위에 따라 최대 최소값 비교
//			for(int j=0; j<n; j++) {
//		
//				if(xarr[j]>xMax) {xMax = xarr[j];}
//				if(xarr[j]<xMin) {xMin = xarr[j];}
//	
//				if(yarr[j]>yMax) {yMax = yarr[j];}
//				if(yarr[j]<yMin) {yMin = yarr[j];}
//				
//			w = xMax - xMin;
//			h = yMax - yMin;
//		}
	
		
		//Arrays.sort한 결과
		Arrays.sort(xarr);
		Arrays.sort(yarr);
		
		//최대값은 가장 끝값= n-1
		w = xarr[n-1]-xarr[0];
		h = yarr[n-1]-yarr[0];
		
		System.out.println(w*h);
		
	
	}
}


//Arrays.sort한 결과가 빠를 줄 알았지만 최대최소값을 정하고 비교한 것에 비해 느림..
