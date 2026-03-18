import java.util.Scanner;

public class countinginstring {
    Scanner sc = new Scanner(System.in);
    String s;
    int cnt(int i) {
        if(i == s.length()) return i;
        return cnt(i + 1);
    }

    void main() {
        s = sc.nextLine();
        System.out.println(cnt(0));
    }

}
