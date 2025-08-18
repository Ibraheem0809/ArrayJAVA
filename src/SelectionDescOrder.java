import java.util.Scanner;

public class SelectionDescOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Selection Sort for Descending Order
        for (int i = 0; i < arr.length - 1; i++) {
            int large = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] > arr[large]){
                    large = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
        }
        System.out.print("Descending array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
