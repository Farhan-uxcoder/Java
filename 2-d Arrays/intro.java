import java.util.*;
public class intro {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n for the 2-matrix");
    int n = sc.nextInt();
    System.out.println("Enter the numbers is the arrays "+n);
    int arr [][] = new int [n][n];
    for (int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("the elements are as follows:\n");
    for (int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            System.out.print(arr[i][j]+"\t");
        }System.out.println();
    }
    System.out.println("Enter the number to search:");
    int key = sc.nextInt();
    for (int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j] == key){
                System.out.println("the element found at ("+(i+1)+","+(j+1)+")");
                return;
            }
        }
    }




sc.close();

}
}