import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), p, first, cur, dx, prev, dx_f = 0;
        boolean change;
        for(int i=0;i<q;++i){
            p = scan.nextInt();
            if(p > 3) {
                change = true;
                first = scan.nextInt();
                prev = first;
                for(int j=0;j<p-1;j++){
                    cur = scan.nextInt();
                    if(j == 0){
                        dx_f = cur - first;
                        if(Math.abs(dx_f) != 1){
                            change = false;
                            j++;
                            prev = cur;
                            cur = scan.nextInt();
                            dx_f = cur - prev;
                        }
                    }

                    dx = cur - prev;
                    if(dx != dx_f && change){
                        change = false;
                        prev = cur;
                    }else if(dx != dx_f){
                        System.out.println("NO");
                        scan.nextLine();
                        break;
                    }else {prev = cur;}
                    if(j == p-2){
                        System.out.println("YES");
                        scan.nextLine();
                    }
                }
            }else{
                System.out.println("YES");
                scan.nextLine();
                scan.nextLine();
            }
        }
    }
}