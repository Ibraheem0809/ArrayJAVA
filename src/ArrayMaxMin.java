import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        System.out.println("Enter 5 element in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min >= arr[i])
                min = arr[i];
        }
        System.out.println("Max element: "+max+" Min element: "+min);
        input.close();
    }
}
