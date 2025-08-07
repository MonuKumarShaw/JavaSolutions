package BinarySearchTeeStrivers;

public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;

        }
          public static Node Insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data> value){
          root.left = Insert(root.left, value);
        }else{
            root.right = Insert(root.right, value);
        }
        return root;
        }
        
        
    }
  
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static boolean Search(Node root,int value){
     if(root == null){
        return false;
     }
     if(root.data == value){
        return true;
     }
     if(root.data > value){
       return Search(root.left, value);
     }
     else{
       return Search(root.right, value);
     }
    
    }
    public static void main(String[] args) {
        int values[] ={5,1,3,4,2,7};
        Node root = null;
        for(int i =0;i<values.length;i++){
        root = Node.Insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        System.out.println(Search(root, 9));
    }
}
