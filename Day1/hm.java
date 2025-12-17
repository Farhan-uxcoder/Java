import java.util.*;
public class hm{
public static boolean Isprime (int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int n){
        for (int i=2;i<=n;i++){
            if(Isprime(i)){
                System.out.println(i+"  ");
            }
        }
    }

    public static void main(String args[]) {
        PrimeRange(6);
    }
}