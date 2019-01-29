class Node {

  public int element;
  public Node next;
  public Node previous;

public Node(){
  element = 0;
  next = null;
  previous = null;
}

public Node(int a, Node prev_neighbour, Node next_neighbour){
  element = a;
  next = next_neighbour;
  previous = prev_neighbour;
}

public int getValue(){
  return element;
}

public int setElement(int a){
  this.element = a;
  return a;
}

public void insertBetween(Node left, Node right, Node middle){
  left.next = middle;
  right.previous = middle;
}

}
