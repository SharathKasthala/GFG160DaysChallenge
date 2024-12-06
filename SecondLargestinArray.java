import java.util.Scanner;

public class SecondLargestinArray {

    public static int secondLargest(int[] arr, int n){
        int secondLargest = -1;
        int largest = arr[0];
        if (n < 2)
            return -1;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
        }

            return secondLargest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print(secondLargest(arr, n));
    }
}
