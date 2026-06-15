import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int l = 0;
        while(a>0)
        {
            int d = a%10;
            if(d>l)
            {
                l = d;
            }
            a=a/10;
        }
            System.out.print(l);
    }
}