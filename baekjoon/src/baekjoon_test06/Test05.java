/*
 *10988번
 *Q. 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 *		팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 *입력:  첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
 *출력:  첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
 */
package baekjoon_test06;
import java.io.*;

public class Test05 {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int output = 1;
		int mid= str.length()/2;
		for(int i=0; i<mid; i++) {
			if(str.charAt(i)!= str.charAt(str.length()-1-i)) {
				output=0;
			}
		}
		System.out.println(output);
	}
}
