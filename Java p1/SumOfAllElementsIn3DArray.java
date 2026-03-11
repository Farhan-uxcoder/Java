import java.util.Scanner;

public class SumOfAllElementsIn3DArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][][]= new int[2][2][2];
        System.out.println("enter the values in the array");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    arr [i][j][k]=sc.nextInt();
                }
            }
        }

        int sum=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    sum=sum+arr[i][j][k];
                }
            }
            }
        System.out.println("the sum is "+sum);

    }
}
