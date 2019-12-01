package imran.code.forces;
import java.util.*;

public class MishkaAndGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a1 = 0;
		int b1 = 0;
		while(n-->0) {
         int a = s.nextInt();
         int b = s.nextInt();
         if(a==b)continue;
         if(a>b) {
        	 a1++;
         }else {
        	 b1++;
         }
         
		}
		System.out.println(a1==b1?"Friendship is magic!^^":a1>b1?"Mishka":"Chris");

	}

}
