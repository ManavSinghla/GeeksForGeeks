/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow=head;
        Node fast=head;
        int c=0;
        int f=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                f=1;
                slow=slow.next;
                c++;
                break;
            }
        }
        while(f==1 && slow!=fast){
            c++;
            slow=slow.next;
        }
        return c;
    }
}