import java.util.Scanner;

class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class Var3 {
    public static void main(String[] args) {
        System.out.println("n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input value");
        Node head = new Node(sc.nextInt(), null);
        Node tail = head;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Input value");
            tail.next = new Node(sc.nextInt(),null);
            tail = tail.next;
        }
        Node ref = head;
        while (ref!=null){
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        ref = head;
        int kol = 0;
        int sum = 0;
        while (ref!=null){
            if(ref.value%5!=0){
                kol++;
                sum = sum + ref.value;
            }
            ref = ref.next;
        }
        System.out.println("kol = " + kol);
        System.out.println("sum = " + sum);
        System.out.println("avg =" + (double)sum/kol);
    }
}