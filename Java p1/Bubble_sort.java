public class Bubble_sort{
    public static void main(String args[]){
        int arr[]={7,8,1,2,3};

        System.out.println("The array before sorted is ");
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        // bubble sort
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //print the sorted array
        System.out.println("\nArray after sorted is ");
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
//public class Bubble_sort {
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 2, 3};
//
//        System.out.println("The array before sorted is:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" " + arr[i]);
//        }
//
//        // bubble sort
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        // print the sorted array
//        System.out.println("\nArray after sorted is:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" " + arr[i]);
//        }
//    }
//}