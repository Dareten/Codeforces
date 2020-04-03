import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), t = 2;
        StringBuilder s = new StringBuilder("I hate ");
        if(n == 1){
            s.append("it");
        }else{
            s.append("that");
        }
        String a = "I hate ";
        String b = "I love ";
        while(t <= n){
            if(t % 2 == 0){
                s.append(" ").append(b);
            }else{
                s.append(" ").append(a);
            }
            if(t++ == n){
                s.append("it");
            }else{
                s.append("that");
            }
        }
        System.out.println(s.toString());
    }
}