package imran.code.forces;
import java.util.*;

public class VanyaAndFence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int h = s.nextInt();
		int sum = 0;
		while(n-->=1) {
			
			if(Math.ceil(s.nextInt()/(h+.0)) <= 1.0) {
				sum++;
				continue;
			}
			sum+=2;
		}
		System.out.println(sum);
		
	}

}
