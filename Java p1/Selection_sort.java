public class Selection_sort {
    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 2, 3};

        System.out.println("The array before sorted is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print the sorted array
        System.out.println("\nArray after sorted is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}