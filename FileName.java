package imran.code.forces;
import java.util.*;
public class FileName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		String st = s.next();
		int sum = 0;
		for(int i = 0;i <n-2; i++) {
			if(st.charAt(i)==120&&st.charAt(i+1)==120&&st.charAt(i+2)==120) {
				sum++;
			}
		}
		System.out.println(sum);
//		String c = "x";
//		System.out.print((int)c.charAt(0));

	}

}
