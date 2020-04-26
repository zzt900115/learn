
/**
 * 链表翻转
 */

public class ListFlip {
    public static void main(String[] args) {
        Node node=new Node();
        initNode(node);
        print(node);
        System.out.println();


       Node head = ListFlip(node);
        print(head);
    }
    public static void initNode(Node node){
        node.obj = "0";
        for(Integer  i = 1;i<5;i++){
            Node  next = new Node();
            next.obj = i.toString();

            node.next= next;

            node = next ;
        }
    }

    public static Node ListFlip(Node node){

        Node p1 = null;
        Node p2 = node;
        Node p3 = null;
        while(p2 != null){
            p3 = p2.next;
            p2.next= p1;
            p1 = p2;
            p2= p3;
        }
        return p1;
    }
    public static   void  print(Node node){
        while(node!=null){
            System.out.print(node.obj);
            node = node.next;
        }
    }
}

class Node{
    String obj;
    Node next;
    public String toString(){
        return this.obj;
    }
}
