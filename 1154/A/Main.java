import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[4];
        int maxx = 1;
        for(int i=0;i<4;i++){
            a[i] = scan.nextInt();
            if(a[i] > maxx){maxx = a[i];}
        }
        for(int i=0;i<4;i++){
            if(a[i] != maxx){
                System.out.print(maxx - a[i] + " ");
            }
        }
    }
}