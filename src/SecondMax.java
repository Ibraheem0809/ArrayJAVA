import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        System.out.println("Enter 5 elements in array: ");
        for (int i : arr) {
            arr[i]= input.nextInt();
        }
        for (int num : arr){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                
            }
        }
    }
}
