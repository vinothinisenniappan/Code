// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int count = 0;
        int vount=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count+=1;
            }
            else{
            vount+=1;
            }
        }
            System.out.println("Vowels "+count);
            System.out.println("Consonants: "+vount);
        }
}