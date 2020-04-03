import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m=scan.nextInt();
        int s=scan.nextInt();
        int[] max;
        int[] min;
        if(m==1 && s==0)System.out.println("0 0");
        else if(s>(9*m) || s<1)System.out.println("-1 -1");
        else {
            max = new int[m];
            min = new int[m];
            int i = 0;
            while (s > 0) {
                if (s > 9) {
                    max[i] = 9;
                    min[m - 1 - i] = 9;
                    s -= 9;
                } else {
                    max[i] = s;
                    min[m - 1 - i] = s - 1;
                    min[0] += 1;
                    break;
                }
                ++i;
            }
            for (int j = 0; j < m; ++j) System.out.print(min[j]);
            System.out.print(" ");
            for (int j = 0; j < m; ++j) System.out.print(max[j]);
        }
    }
}