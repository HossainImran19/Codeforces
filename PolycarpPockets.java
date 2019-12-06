package imran.code.forces;
import java.util.*;
public class PolycarpPockets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = new Scanner(System.in).nextInt();
		int ara[] = new int[n];
		for(int l = 0; l < n; l++) {
			ara[l] = s.nextInt();
		}
		
		Arrays.sort(ara);
		int count = 1;
		int max = 0;
		int max1 = 0;
		
		for(int i = 0; i< ara[n-1]; i++) {
			int sum = 0;
			int sum1 = 0;
			
			for(int j = 0; j < n; j++) {
				if(count==ara[j]) {
					sum++;
				}
			}
			//System.out.println(sum);
			count++;
			for(int k = 0; k < n; k++) {
				if(count==ara[k]) {
					sum1++;
				}
			}
			//System.out.println(sum1);
			if(sum<sum1) {
				max = sum1;
			}else {
				max = sum;
			}
			if(max1<max) {
				max1=max;
			}
			//System.out.println("\t"+max1);
			count++;
		}
		System.out.println(max1);
	}
}
