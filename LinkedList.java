// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
               Node head = null;
        Node tail = null;
        for(int i=0;i<a;i++){
        int value = sc.nextInt();
        Node n = new Node(value);
 
        if(head==null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        }
        Node temp = head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
        }
    }
}