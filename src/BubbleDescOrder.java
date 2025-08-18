import java.util.Scanner;

public class BubbleDescOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int passes = 0;
        // Bubble Sort in Descending Order
        for (int j = 0; j < arr.length - 1; j++) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
            if(!swapped){
                break;
            }
        }
        System.out.println("No. of Passes: "+passes);
        System.out.println("Sorted Array in Descending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
