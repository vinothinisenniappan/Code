import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int left = 0;
        int right = s.length()-1;
        boolean istrue = true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                istrue = false;
                break;
            }
            left++;
            right--;
        }
        if(istrue){
            System.out.print("Pa");
        }
        else{
            System.out.print("No");
        }
    }
}