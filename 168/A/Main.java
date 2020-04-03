import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x = scan.nextInt();
        double y = scan.nextInt() / 100d;
        System.out.print(Math.max(0, (int)Math.ceil(y * n  - x)));
    }
}