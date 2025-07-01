/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node a=head;
        Node b=a.next;
        a.next=null;
        while(b!=null){
            Node temp=b.next;
            b.next=a;
            a=b;
            b=temp;
        }
        return a;
    }
    static Node addTwoLists(Node l1, Node l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        Node dummy =new Node(0);
        Node temp=dummy;
        int carry=0;
        while(l1!=null || l2!= null || carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            Node ans= new Node(sum%10);
            carry=sum/10;
            temp.next=ans;
            temp=temp.next;
        }
        Node result = reverse(dummy.next);
        if(result.data==0 && result.next!=null) return result.next;
        return result;
    }
}