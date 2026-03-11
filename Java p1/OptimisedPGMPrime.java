public class OptimisedPGMPrime {

    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        //for(int i=0 to i<=rootn)
            System.out.println(isPrime(3));
    }
}
