import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        System.out.println("Enter 5 elements in array: ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = input.nextInt();
        }
        System.out.print("Reversed Array: ");
        int i = arr.length - 1;
        while(i>=0){
            System.out.println(arr[i]);
            i--;
        }
        input.close();
    }
}
