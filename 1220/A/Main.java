import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        String s = scan.nextLine();
        long ones = s.chars().filter(ch -> ch == 'n').count();
        long zeros = s.chars().filter(ch -> ch == 'z').count();
        for(int i=0;i<ones;i++){
            System.out.print("1 ");
        }
        for(int i=0;i<zeros;i++){
            System.out.print("0 ");
        }

    }
}