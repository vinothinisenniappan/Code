
import java.util.*;
class Main {
    static void printnumbers(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printnumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printnumbers(a);
    }
}