import java.util.Scanner;
public class FactorialPr4 {
    public static int factorial(int N){
        if (N<=1)
            return 1;
        return factorial(N-1) * N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
