import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c =0;
        while(a>0)
        {
            int d = a%10;
            c=c+d;
            a=a/10;
        }
        System.out.print(c);
    }
}