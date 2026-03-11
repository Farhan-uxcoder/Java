import java.util.*;
public class sumofoddandeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int osum=0;
        int esum=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                esum=esum+i;
            }else
                osum=osum+i;
            }
        System.out.println("even "+esum);
        System.out.println("odd "+osum);
    }
}

