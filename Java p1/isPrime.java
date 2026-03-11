import java.util.*;

public class isPrime {

    //only for n>2
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }

        boolean isPrime = true;
        for (int i=2;i<n-1;i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(isprime(5));
    }
}
