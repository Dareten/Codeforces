import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), k = scan.nextInt();
        if(n <= m && n <= k){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}