// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int k : arr){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}