// Variable Length Arguments 
import java.util.Arrays;
import java.util.Scanner;

public class Function_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    boolean ans = isprime(n);
    System.out.println(ans);
    }
    
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
       return c*c>n;
    }
   
}
