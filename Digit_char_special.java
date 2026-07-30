// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int character=0;
        int digit=0;
        int special=0;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(Character.isDigit(ch)){
                digit+=1;
            }
            else if(Character.isLetter(ch)){
                character+=1;
            }
            else{
                special+=1;
            }
        }
        System.out.println("Digit: "+digit);
        System.out.println("Character: "+character);
        System.out.println("Special: "+special);
    }
}
