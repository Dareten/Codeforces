import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), c = 0;
        while(n > 0){
            if(n >= 100){
                n -= 100;
            }else if(n >= 20){
                n -= 20;
            }else if(n >= 10){
                n -= 10;
            }else if(n >= 5){
                n -= 5;
            }else{
                n -= 1;
            }
            c++;
        }
        System.out.println(c);
    }
}