import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 7
        int a;
        int b = 1;
        int c = 0;
        int i = 0;
        while (i < n) {
            i++;
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);

    }
}
