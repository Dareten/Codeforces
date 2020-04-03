import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xxx = scan.nextInt();
        for(int i=0;i<xxx;i++){
            int n = scan.nextInt(), c = 0;
            c += n % 2;
            n += c;
            if (!((n / 2 - 1) > 0)) {
                c += 2;
            }
            System.out.println(c);
        }
    }
}