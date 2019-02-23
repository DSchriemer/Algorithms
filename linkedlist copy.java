class linkedlist
{

  class Node{
    Node next = null;
    int data = 0;

    public Node(int a)
    {
      data = a;
    }

    void appendTail(int a)
    {
      Node end = new Node(a);
      if(root==null)
      {
        root = end;
      }
      Node n = this;
      while (n.next != null)
      {
        n = n.next;
      }
      n.next = end;
    }
  }

  Node root = null;

  public static void main(String[] args)
  {

    Node node1 = new Node();
    node1.appendTail(8);
  }


}
