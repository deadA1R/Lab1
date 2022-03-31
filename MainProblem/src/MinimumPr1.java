import java.util.Scanner;

public class MinimumPr1 {
    public static int minimumInArray(int N, int arr[]){
        int min = arr[0];
        for(int i = 1; i<N; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = minimumInArray(n, arr);
        System.out.println(result);
    }
}
