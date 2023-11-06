class LinkedList{
    class Node{
      int data;
      Node next;
      Node(int val){
        this.data=val;
        this.next=null;
      }
    }
  
    Node head=null;
  
    void add(int data){
      Node newNode= new Node(data);
        if(head==null){
          head=newNode;
        }else{
          newNode.next=head;
          head=newNode;
        }
    }
  
    void reverseLL(){
      Node prev=null;
      Node curr=head;
      Node nxt=head.next;
  
      while(curr != null){
        curr.next=prev;
        if(nxt == null){
          prev=curr;
          curr=nxt;
        }else{
          prev=curr;
          curr=nxt;
          nxt=nxt.next;
        }
      }
  
      head=prev;
    } 
  
    void disp(){
      Node temp=head;
      System.out.print("head->");
      while(temp !=null){
        System.out.print(temp.data + " ->");
        temp=temp.next;
      }
      System.out.print("null");
    }
  }
  
  public class ReveseLinkedList{
  
    public static void main(String[] args) {
      LinkedList list=new LinkedList();
      list.add(6);
      list.add(4);
      list.add(9);
      list.add(3);
  
      list.disp();
  
      list.reverseLL();
      System.out.println();
      list.disp();
  
    }
  }
