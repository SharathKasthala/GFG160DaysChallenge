import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[n-i-1] + " ");
        }
    }
}
