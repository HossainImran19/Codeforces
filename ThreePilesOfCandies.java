package imran.com.adddivsubmult;
import java.util.*;
public class ThreePilesOfCandies {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double ara[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			long a1 = s.nextLong();
			long a2 = s.nextLong();
			long a3 = s.nextLong();
			long k = (a1+a2+a3);
			System.out.println(k%2==0?k/2:(k-1)/2);
		}   
//		long a = 3 * 10000000000000000L;
//		long b = (a/2L);
//		System.out.print(b);
	}
}










































