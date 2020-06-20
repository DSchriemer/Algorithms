class template {

  //given string A and B, return true if they are equal.
  //Backspace characters are laveled as #

  //ab#a == aa

public static void main(String[] args){
  String s = "hello";
  String b = "helll#o"
  System.out.println(method(s));
}


  public static Boolean method(String s, String b) {

    Stack<Character> stackone = new Stack<Character>();
    for (char c : s.toCharArray())
    {
      if(c != '#')
      {
        stackone.push(c);
      }else
      {
        if (!stackone.isEmpty())
        {
          stackone.pop();
        }
      }

    }

    Stack<Character> stacktwo = new Stack<Character>();
    for (char c : b.toCharArray())
    {
      if(c != '#')
      {
        stacktwo.push(c);
      }else
      {
        if (!stacktwo.isEmpty())
        {
          stacktwo.pop();
        }
      }
    }

    while(!stackone.isEmpty)
    {
      char tmp = stackone.pop();
      if(stacktwo.isEmpty() || stacktwo.pop() != tmp)
      {
        return false;
      }
    }

    return stackone.isEmpty() && stacktwo.isEmpty();

  }
}
