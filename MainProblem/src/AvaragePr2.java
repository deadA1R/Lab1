import java.util.Scanner;

public class AvaragePr2 {
    public static double average(int N, int arr[]){
        double sum = 0;
        for(int i = 0; i<N; i++) {
            sum += arr[i];
        }
        return sum/N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        double result = average(n, arr);
        System.out.println(result);
    }

}
