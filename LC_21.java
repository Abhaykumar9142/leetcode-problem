import java.util.LinkedList;
import java.util.PriorityQueue;

public class LC_21 {
    public static void main(String[] args) {
        class listNode{
            int data;
            listNode next;
            listNode(int value){
                this.data=value;
            }
        }
        listNode n1=new listNode(90);
        listNode n2=new listNode(40);
        listNode n3=new listNode(20);
        listNode n4=new listNode(30);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        listNode list1=n1;

        listNode n5=new listNode(80);
        listNode n6=new listNode(35);
        listNode n7=new listNode(70);
        listNode n8=new listNode(10);
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        listNode list2=n5;
        System.out.println(n1.data);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        listNode temp1=list1;
        while(temp1!=null){
            pq.add(temp1.data);
            temp1=temp1.next;
        }
        listNode temp2=list2;
        while(temp2!=null){
            pq.add(temp2.data);
            temp2=temp2.next;
        }
        System.out.println(pq);
        listNode head3=null;
        listNode tail3=null;
       while (!pq.isEmpty()){
            int val=pq.poll();
            listNode node=new listNode(val);
            if(head3==null){
                head3=node;
                tail3=node;
            }else{
                tail3.next=node;
                tail3=node;
            }
        }

       listNode temp3=head3;
       while(temp3!=null){
           System.out.print(temp3.data+" ");
        temp3=temp3.next;
       }

    }
}
