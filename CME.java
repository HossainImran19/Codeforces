package imran.code.forces;
import java.util.*;

public class CME {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		int a[]=new int[q];//declaration and instantiation  
		for(int i = 0; i < q; i++) {
			int n = s.nextInt();
			if(n % 2 != 0) {
				a[i] = 1;
			}else if(n == 2) {
				a[i] = 2;
			}else {
				a[i] = 0;
			}
		}
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
	}
}
