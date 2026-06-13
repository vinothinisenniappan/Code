import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int org = a;
        int rev =0;
        while(a>0)
        {
            int d = a%10;
            rev=rev*10+d;
            a=a/10;
        }
        if(org==rev)
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not palindrome");
        }
    }