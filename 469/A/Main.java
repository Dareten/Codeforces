import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), t;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<2;i++){
            t = scan.nextInt();
            for(int j=0;j<t;j++){
                set.add(scan.nextInt());
            }
        }
        String s;
        if(n - set.size() == 0){
            s = "I become the guy.";
        }else{
            s = "Oh, my keyboard!";
        }
        System.out.print(s);
    }
}