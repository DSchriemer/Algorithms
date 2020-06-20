class template {

  //Reverse

  public static String method(ListNode head) {

    Stack<ListNode> stack - new Stack<ListNode>();

    while(head != null) {
      stack.push(head);
      head = head.next;
    }

    ListNode tmp = new ListNode(-1);
    head = tmp;
    while(!stack.isEmpty()){
      ListNode current = stack.pop();
      head.next = new ListNode(current.val);
      head = head.next;
    }

    return dummy.next;
  }

  public static String NoStack!!(ListNode head) {

    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;

    while(current != null)
    {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    return previous




  }
}
