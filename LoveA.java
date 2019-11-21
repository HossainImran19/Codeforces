package imran.code.forces;
import java.util.*;
public class LoveA{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a = 0;
        int b = 0;
        for(int i = 0; i < str.length();i++){
            int in = str.charAt(i);
            if(in == 97){
                a++;
            }else{
                b++;
            }
        }
        if(a < b){
            while(a<=b){
                b--;
            }
            System.out.println(a+b);
        }else{
            System.out.println((a>b)?str.length():str.length()-1);
        }
    }
}
