// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(map.get(ch)==1){
                
             System.out.print(ch);
                found = true;
                break;
            }
        }
        if(!found){
      System.out.print(-1);}
      
    }
}