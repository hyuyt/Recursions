import java.util.Scanner;

public class pow {
    int binpow(int a, int b) {
        if(b == 1) return a;
        if(b % 2 == 0) {
            int cur = binpow(a, b / 2);
            return cur * cur;
        } else {
            int cur = binpow(a, b / 2);
            return cur * cur * a;
        }
    }

    void main() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(binpow(a, b));
    }
}
