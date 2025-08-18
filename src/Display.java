import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        System.out.println("Enter 5 elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Entered elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
