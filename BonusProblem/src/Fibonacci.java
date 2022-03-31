import java.util.Scanner;

public class Fibonacci {
    public static int numFibonacci(int N){
        if (N<=0) {
            return 0;
        }
        if (N<=2) {
            return N - 1;
        }
        return numFibonacci(N-1) + numFibonacci(N-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = numFibonacci(n);
        System.out.println(result);
    }
}
