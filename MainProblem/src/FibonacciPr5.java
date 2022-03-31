import java.util.Scanner;
public class FibonacciPr5 {
    public static int numFibonacci(int N){
        if (N<=1)
            return N;
        return numFibonacci(N-1) + numFibonacci(N-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = numFibonacci(n);
        System.out.println(result);
    }

}
