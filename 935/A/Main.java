import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x = 1, c = 0;
        while (x < n){
            if((n - x) % x == 0){c++;}
            x++;
        }
        System.out.print(c);
    }
}