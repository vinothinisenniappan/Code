import java.util.*;
public class Anagram {
    public static void main(String args[]){    
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    char[] c = a.toCharArray();
    char[] d = b.toCharArray();
    Arrays.sort(c);
    Arrays.sort(d);
    if(Arrays.equals(c,d)){
        System.out.print("Anagram");
    }
    else{
        System.out.print("Not anagram");
    }
    }
}
`