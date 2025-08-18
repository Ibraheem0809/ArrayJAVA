import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int[] dupl;
        dupl = new int[5];
        System.out.println("arr = {10, 20, 30, 40, 50}");
        for (int i = 0; i < arr.length; i++) {
            dupl[i] = arr[i];
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("Duplicate Array: ");
        for (int i = 0; i < dupl.length; i++) {
            System.out.print(dupl[i]+" ");
        }
    }
}
