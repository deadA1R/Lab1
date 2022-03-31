import java.util.Scanner;
public class PowerPr6 {
    public static int powerN(int A, int N){
        if (N <= 0){
            return 1;
        }
        return powerN(A, N-1) * A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = powerN(a, n);
        System.out.println(result);
    }
}
