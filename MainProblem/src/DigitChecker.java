import java.util.Scanner;

public class DigitChecker {
    public static boolean digitChecker(String S, int i){
        char ch = S.charAt(i);
        if(Character.isLetter(ch)){
            return false;
        }
        if(i==0){
            return true;
        }
        return digitChecker(S,i-1);
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
