import java.util.*;

public class printSum {

    public static void PrintSum(int i,int n, int sum){
        if (i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSum(i+1,n,sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        PrintSum(1,n,0);
    }

}
