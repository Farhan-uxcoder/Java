public class PrintNum {
    //printing numbers from 5 to 1 using recursion 
    public static void printNum(int n){
        if (n==0)
            return;
        System.out.println(n);
        printNum(n-1);
    }

    //printting 1 to n using recurion
    Public static void Printoneton(int n){
        if (n==0)
            return;
        Printoneton(n-1);
        System.out.println(n);
    }

    public static void  main(String args[]){
        int n=5;
        printNum(n);
    }



}
