import java.util.Scanner;

public class DigitChecker {
    public static boolean digitChecker(String S, int i){
        char ch = S.charAt(i);
        if (i==0){
            return true;
        }
        if(Character.isDigit(ch)){
            return digitChecker(S,i-1);
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int last = s.length()-1;
        if (digitChecker(s, last)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
