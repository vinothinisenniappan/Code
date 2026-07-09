import java.util.*;

// import com.sun.corba.se.impl.orbutil.graph.Node;

class Main{
    static Node create(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else if(data<root.data){
            root.left = create(root.left,data);
        }
        else{
            root.right = create(root.right,data);
        }
        return root;
    }
    static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Node root=null;
        for(int i=0;i<a;i++){
            int data = arr[i];

            root = create(root, data);
        }
   bfs(root);
    }

    
}

class Node{
    int data;
    Node right,left;

    Node(int data){
        this.data=data;
        right=left=null;
    }
}