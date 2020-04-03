import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<4;i++){
            set.add(scan.nextInt());
        }
        System.out.print(4 - set.size());
    }
}