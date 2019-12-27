/*
The problem is here "https://codeforces.com/problemset/problem/734/A"
*/


import java.util.*;

public class AntonAndDenik {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String st = s.next();
		int n = 0;
		
		
	
		while(a - 1>0) {
			int m = 0;
			int b = st.charAt(m);
			if(b == 65) {
				n++;
			}else {
				continue;
			}
			m++;
			a--;
		}
		System.out.println(n == (a-n)?"Friendship":n > (a-n)?"Anton":"Danik"); 
				

	}

}
