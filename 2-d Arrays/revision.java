import java.util.*;
public class revision {

    // functions to reverse an array
    public static void rev_arr(int arr[]){
        int start = 0 , last = arr.length-1;
        while (start < last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;
        }
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }



    public static int ls(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Key:" + key+" found at index:"+i+" and location:"+(i+1));
            }
        }
        return 0;
    }

    public static int binarySearch(int arr[],int key){
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bismillah");

        // the variable names can also start with the symbol $

        // System.out.println("Enter the value to check weather the variable can take values if there name starts with '$'");
        // int $num = sc.nextInt();
        // System.out.println("The value of $num is : "+ $num);
        // System.out.println("Hence proved as we can use '$' symbol for naming the variables ");

        /*
        print the following pattern
        *
        **
        ***
        ****
        */

        for(int i = 0 ; i<=4 ; i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }System.out.println();
        }
System.out.println();

/*
print the inverted triangle pattern
****
***
**
*
*/
        for(int i = 1 ; i<=4 ; i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }System.out.println();
        }

        /*
        print the half pyramid pattern
        1
        1 2
        1 2 3
        1 2 3 4
        */
        for(int i = 1 ; i<=5 ; i++){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }

        /*
        print the following character pattern
        A
        B C
        D E F
        G H I J
        */
        char ch = 'A';
        for(int i = 0 ; i<=4 ; i++){
            for(int j=0;j<i;j++){
                System.out.print(ch+" ");
                ch++;
            }System.out.println();
        }

        System.out.println("enter the size of the array-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in array for binary search");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to search:");
        int key = sc.nextInt();
        ls(arr, key);

        int res = binarySearch(arr, key);
        if(res ==-1){
            System.out.println("element not found in binary search");
        }else{
            System.out.println("element found at "+res);
        }
        System.out.println("The reversed array is :");
        rev_arr(arr);




    }
}
