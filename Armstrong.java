import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int val = a;
        int arm = 0;
        int k = 0;
        while(a>0)
        {
            int d = a%10;
            arm = d*d*d;
            k = arm+k;
            a = a/10;
        }
        if(k == val)
        System.out.print("Armstrong");
        else
        System.out.print("Not a Armstrong");

    }
}