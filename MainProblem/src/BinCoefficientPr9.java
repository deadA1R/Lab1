import java.util.Scanner;

public class BinCoefficientPr9 {
    public static int binCoefficient(int N, int M){
        if (M == 0 || M == N){
            return 1;
        }
        return binCoefficient(N-1, M-1) + binCoefficient(N-1, M);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = binCoefficient(n, m);
        System.out.println(result);
    }
}
