import java.util.Scanner;

public class average {
     double rec(int n){
         Scanner sc = new Scanner(System.in);
         double cur = sc.nextDouble();
         if(n == 1) return cur;
         return (cur + rec(n - 1));
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rec(n) / n);
    }
}
