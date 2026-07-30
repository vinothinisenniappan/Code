// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int up=0;
        int low=0;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                up+=1;
            }
            else{
                low+=1;
            }
        }
        System.out.println("Uppercase: "+up);
        System.out.println("Lowercase: "+low);
    }
}