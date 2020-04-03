import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            System.out.println(solve(scan.nextInt(), scan.nextInt()));
        }
        scan.close();
    }

    static long solve(int A, int B) {
        int count = 0;
        for (long b = 9; b <= B; b = b * 10 + 9) {
            ++count;
        }

        return (long) A * count;
    }
}