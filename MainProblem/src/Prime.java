import java.util.Scanner;
public class Prime {
    public static boolean checkPrime(int N){
        boolean prime = true;
        for(int i = 2; i <= N / 2; i++){
            if(N % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n == 1 || n == 0){
            System.out.println("Not Prime");
        }
        else if(checkPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }

}
