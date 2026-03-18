import java.util.Scanner;

public class GCD {
    Scanner sc = new Scanner(System.in);
    int gcd(int a, int b) {
        if(b == 0) return a;
        int cur = a % b;
        return gcd(b, cur);
    }

    void main() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
