import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s;
        for(int i=0;i<n;i++){
            s = scan.nextLine();
            if(s.length() > 10){
                System.out.println(s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(s.length()-1));
            }else{
                System.out.println(s);
            }
        }
    }
}