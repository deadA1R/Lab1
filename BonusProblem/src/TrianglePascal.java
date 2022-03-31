import java.util.Scanner;

public class TrianglePascal {
    public static int binomial(int N, int M){
        if (M == 0 || M == N){
            return 1;
        }
        return binomial(N-1, M-1) + binomial(N-1, M);

    }

    public static void pascal(int K){
        for (int i = 0; i < K; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(binomial(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        pascal(k);
    }
}
