package imran.code.forces;
import java.util.*;

public class Magnets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0, b = 0;
//		for(int j = 0; j < n; j++) {
//            int i = s.nextInt();
//			
//			if(i != b) {
//				a++;
//			}else {
//				continue;
//			}
//			b = i;
//		}
		while(n+1>1) {
			String st = s.next();
			if(!st.equals(b)) {
				a++;
				b = a;
				n--;
			}
		}
		System.out.println(a); 
    }	
}


