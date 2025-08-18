import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num;
        int sum = 0;
        num = new int[5];
        System.out.println("Enter 5 elements in array");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
            sum = sum + num[i];
        }
        System.out.println("Sum of Array:"+sum);
    }
}
