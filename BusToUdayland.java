/*
The problem is given here "https://codeforces.com/problemset/problem/711/A"
*/

import java.util.*;
public class BusToUdayland {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String bool = "";
		char b[][] = new char[n][5]; 
		
	    for (int i = 0; i < n; i++) {
	        String data = "";
	        if (s.hasNext()) { 
	            data = s.next();
	        } else {
	            break;
	        }
	        for (int j = 0; j < 5; j++)
	            b[i][j] = data.charAt(j); 
	    }
	    for(int i = 0; i < n; i++) {
	    	if(b[i][0]!='X'&&b[i][0]==b[i][1]) {
	        	b[i][0]='+';
	        	b[i][1]='+';
	        	bool="YES";
	        	break;
	        }else if(b[i][3]!='X'&&b[i][3]==b[i][4]) {
	        	b[i][3]='+';
	        	b[i][4]='+';
	        	bool="YES";
	        	break;
	        }else {
	        	bool = "NO";
	        }
	    }
	    System.out.println(bool);
	    if(bool=="YES") {
	    	for(int i = 0; i < n; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print(b[i][j]);
				}
				System.out.println();
			}
	    }
	   
	}
}
