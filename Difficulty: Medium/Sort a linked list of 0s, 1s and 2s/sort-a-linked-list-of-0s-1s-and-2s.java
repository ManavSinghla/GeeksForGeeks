/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int a=0;
        int b=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0) a++;
            else if(temp.data==1) b++;
            temp=temp.next;
        }
        Node slow=head;
        while(slow!=null){
            if(a>0){
                slow.data=0;
                a--;
            }
            else if(b>0){
                slow.data=1;
                b--;
            }
            else{
                slow.data=2;
            }
            slow=slow.next;
        }
        return head;
    }
}