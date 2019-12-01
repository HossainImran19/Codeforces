package imran.code.forces;
import java.util.*;

public class FrogJumping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//      602436426 877914575 158260522
		int t = s.nextInt();
		double ara[] = new double[t];
		for(int i = 0; i < t; i++) {
			long a = s.nextInt();
			long b = s.nextInt();
			long k = s.nextInt();
			System.out.println((a-b)*(k/2)+(k%2==0?0:a));
			
		}
        //double d = Math.ceil(((158260522+.0)/2)*(602436426+.0-877914575+.0));
       //System.out.printf("%.0f",d);
	}
}






















