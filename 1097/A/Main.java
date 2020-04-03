import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hand = scan.nextLine(), answer = "NO";
        String[] table = scan.nextLine().split(" ");
        for(int i=0;i<5;i++){
            if(table[i].charAt(0) == hand.charAt(0) || table[i].charAt(1) == hand.charAt(1)){
                answer = "YES";
                break;
            }
        }
        System.out.print(answer);
    }
}