package imran.code.forces;
import java.util.*;

public class SweetProblem {
	public static int[] ara = new int[3];
	
	public static void max(int a, int b, int c) {
		int ara1[] = {a, b, c};
		for(int i = 0; i < 3; i++) {
			int max = 0;
			for(int j = 0; j < 3; j++) {
				if(max<ara1[j]) {
					max = ara1[j];
				    
				}
			}
			ara[i] = max;
			for(int k = 0; k < 3; k++) {
				if(max==ara1[k]) {
					ara1[k]=0;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		for(int i = 0; i < n; i++) {
			int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
			//max(a, b, c);
			//int ara[] = {a,b,c};
	        //Arrays.sort(ara);
			max(a,b,c);
			if((ara[2]+ara[1]<=ara[0])) {
				System.out.println(ara[2]+ara[1]);
			}else {
				System.out.println((ara[0]+ara[1]+ara[2])/2);
			}
			System.out.printf("%s", Arrays.toString(ara));
		}
	
//		for(int k : ara) {
//			System.out.println(n);
//		}
	}
}




























































