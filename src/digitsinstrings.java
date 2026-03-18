import java.util.Scanner;

public class digitsinstrings {
    String s;
    Scanner sc = new Scanner(System.in);

    boolean check(int i) {
        if(i == s.length()) return true;
        if(!Character.isDigit(s.charAt(i))) return false;
        return check(i + 1);
    }

    void main() {
        s = sc.nextLine();
        if(check(0)) System.out.println("Yes");
        else System.out.println("No");
    }
}
