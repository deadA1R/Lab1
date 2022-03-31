import java.util.Scanner;

public class GCD {
    public static int gcd(int N, int M){
        if (N == M){
            return N;
        }
        else{
            if(N>M){
                return gcd(N-M, M);
            }
            else{
                return gcd(N,M-N);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = gcd(n, m);
        System.out.println(result);
    }
}
