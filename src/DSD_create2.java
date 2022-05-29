package dsd_create;

class Node2{
    public int value2;
    public Node2 next2;

    Node2(int value, Node2 next){
        this.value2 = value;
        this.next2 = next;
    }
}
public class DSD_create2 {
    public static void main(String[] args){
        Node2 head = null;
        for (int i = 9 ; i >= 0; i--){
            head = new Node2(i,head);
        }
        Node2 ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value2);
            ref = ref.next2;
        }
    }
}