import java.util.Scanner;

public class MoveZerostoLast {
    public static int[] moveZeros(int n, int arr[]){
        int count = 0;
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            if(arr[i] != 0) {
                temp[count++] = arr[i];
            }
        }
        return temp;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int[] res = moveZeros(n, arr);
        for(int i = 0; i < n; i++){
            System.out.print(res[i] + " ");
        }
    }
}
