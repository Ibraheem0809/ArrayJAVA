import java.util.Scanner;

public class SearchEl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        System.out.println("Enter 5 elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int find = input.nextInt();
        int flag = 0;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(find == arr[i]){
                flag = 1;
                ind = i;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("Element found on index "+ind);
        }
        else{
            System.out.println("Element NOT found");
        }
    }
}
