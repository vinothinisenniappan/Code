// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int num=0;
        while(a>0){
           int digit = a%10;
           int k = digit*digit*digit;
            num +=k; 
            a = a/10;
        }
        if(num==temp){
        System.out.println("Armstrong");}
        else{
        System.out.print("Not armstrong");
    }
    }
}