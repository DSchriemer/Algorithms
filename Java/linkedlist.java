//import Node.java;

class linkedlist
{

  Node root = new Node();
  int length = 0;

  public linkedlist(){
    root = null;
  }

public int insert(int a){
  Node tmp = new Node();


  if (this.root == null){
    System.out.println("root is null");
    tmp.element = a;
    root = tmp;
    return a;
  }
  tmp = this.root;
  while (tmp.next!=null){
    tmp = tmp.next;
  }
  Node addition = new Node();
  addition.element = a;
  tmp.next = addition;
  length++;
  return 0;
}

public int delete(int a){
  Node tmp = root;


  if (tmp.element == a){
    this.root = tmp.next;
    length--;
    return a;
  }

  Node prev = tmp;
  while (tmp != null){
    tmp = tmp.next;
    if (tmp.element == a){
      prev.next = tmp.next;
      length--;
      return 0;
    }
    prev = tmp;
  }
  return 0;
}

public static linkedlist combiner(linkedlist a, linkedlist b){
  Node tmp = new Node();
  tmp = a.root;
  while (tmp != null){
    b.insert(tmp.element);
    tmp = tmp.next;
  }
  return a;
}

public void deleteDup(){
  Node current = this.root;
  while(current != null){
    Node tmp = current;
    while (tmp.next!= null)
    {
      if (tmp.next.element == current.element)
      {
        tmp.next = tmp.next.next;
      }else{
        tmp = tmp.next;
      }
    }
    current = current.next;
  }
}

public String toString(){
  if (this.root == null){
    return "[]";
  }
  String result = "[" + root.element;
  Node current = root.next;
  while (current != null){
    result += ", " + current.element;
    current = current.next;
  }
  result += "]";
  return result;
}

public static int recurPrint(Node a){
  if (a == null){
    return 0;
  }
  recurPrint(a.next);
  System.out.print(a.element + " ");
  return 1;
}

public void reversal(){
  reversal(this.root);
}

public static void reversal(Node a){

  //System.out.println(a.next.element);

  if(a.next == null){
    System.out.println("nothing left");


  }else{
    System.out.println(a.element);
    reversal(a.next);
    int tmp = a.element;
    a.element = a.next.element;
    a.next.element = tmp;

  }
}



public static void main(String[] args){

  Node tmp = new Node();
  linkedlist list = new linkedlist();
  list.insert(1);
  list.insert(7);
  list.insert(8);

  linkedlist list2 = new linkedlist();
  list2.insert(99);

  list.reversal();

  combiner(list2, list);



  list.root.next.setElement(3);
  recurPrint(list.root);
  System.out.println(list.toString());


}
}
