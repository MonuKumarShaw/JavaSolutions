package LinkedListStrivers;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //1. create a new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
         head = tail = newNode;
         return;
        }
        // 2/ newNod.next = head
        newNode.next = head;
        //3. head = newNode;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data); 
        size++;
        if(head == null){
         head = tail = newNode;
         return;
        }
       tail.next = newNode;
        tail = newNode;

    }
    public void addAtIndex(int idx, int data){
     
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if(head == null){
            System.out.println("The linked is empty");
            return;
        }
        int i =0;
        Node currNode = head;
        while(i<idx-1){
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        
    }

    // remove operation

    public void removeFirst(){
        if(head == null){
            System.out.println("the ll is empty");
            return;
        }
        if(size ==1){
            head = tail = null;
            size =0;
            return;
        }
        head = head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("the ll is empty");
            return;
        }
        if(size ==1){
            head = tail = null;
            size =0;
            return;
        }
        Node currNode = head;
        int i =0;
        while(i<size-2){
            currNode = currNode.next;
            i++;

        }
        currNode.next = null;
        tail = currNode;
        size--;
    }


    //Iterative search
    public int iterativeSearch(int key){
        if(head == null){
            return -1;
        }
        Node currNode = head;
        int i =0;
        while(i< size){
            if(currNode.data == key){
                return i;
            }
            currNode = currNode.next;
            i++;
        }
        return -1;
    }

    // recusive search

    public int recusiveSearch(int key, int i, Node currNode){
     if(head == null){
        return -1;
     }
     if(i == size){
        return -1;
     }
     if(currNode.data == key){
        return i;
     }
     return recusiveSearch(key, i+1, currNode.next);
    }

    // reverse the ll

    public void reverse(){
        Node prev = null;
        Node curr = tail =head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void printList(){
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
       
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printList();
        ll.addAtIndex(2, 3);
        ll.printList();
        ll.removeFirst();
        ll.printList();
        ll.removeLast();
        ll.printList();
        System.out.println(ll.size);
        System.out.println(ll.iterativeSearch(2));
        System.out.println(ll.recusiveSearch(3, 0, head));
        ll.reverse();
        ll.printList();

    }
}
