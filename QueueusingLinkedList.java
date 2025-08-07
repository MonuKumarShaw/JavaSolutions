package queue;

public class queueusingll {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class queue{
       static Node head = null;
        static Node tail = null;
        // is empt
     public static boolean isEmpt(){
        return head==null;
     }
        // add
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpt()){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remoe
        public static int remoe(){
            if(isEmpt()){
                System.out.println("the ll is empt ");
                return -1;
            }
            int result = head.data;
            head = head.next;
            if(head == null){
                tail= null;
            }
            return result;
        }

        //peek
        public static int peek(){
            if(isEmpt()){
                System.out.println("the ll is empt");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
      queue q = new queue();
      q.add(1);
      q.add(2);
      q.add(3);
      while(!q.isEmpt()){
        System.out.println(q.peek());
        q.remoe();
      }  
    }
}