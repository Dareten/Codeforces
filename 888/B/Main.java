import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), u = 0, d = 0, r = 0, l = 0;
        scan.nextLine();
        String s = scan.nextLine();
        for(int i=0;i<n;++i){
            switch (s.charAt(i)){
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'L':
                    l++;
                    break;
            }
        }
        System.out.print(n - Math.abs(u - d) - Math.abs(l - r));
    }
}