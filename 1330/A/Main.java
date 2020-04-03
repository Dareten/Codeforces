import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt(), n, x, index, temp;
        scan.nextLine();
        ArrayList<Integer> a = new ArrayList<>();
        for(int t=0;t<total;++t){
            index = 1;
            n = scan.nextInt();
            x = scan.nextInt();
            for(int i=0;i<n;++i){
                temp = scan.nextInt();
                if(!a.contains(temp)) a.add(temp);
            }
            Collections.sort(a);
            scan.nextLine();
            for(int i=1;i<=a.size();++i,++index){
                if(a.get(index - 1) != i){
                    x--;
                    a.add(index - 1, i);
                }
                if(x==0){
                    break;
                }
            }
            for(int i=1;i<a.size() + 1;++i){
                if(a.get(i-1) != i){
                    System.out.println(i - 1 + x);
                    a.clear();
                    break;
                }
                if(i == a.size()){
                    System.out.println(i + x);
                    a.clear();
                    break;
                }
            }
        }
    }
}