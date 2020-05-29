class valadParentheses {

  //() = true
  //()[]{} true
  //(] = false
  //([)] = false

public static void main(String[] args){
  String s = "[{()}]";
  System.out.println(method(s));
}


  public static String method(String s) {

    Stack<Character> stack = new Stack<Character>();

    for(char c: s.toCharArray()){

      if(c == '(' || c == '[' || c == '{')
      {
        stack.push(c);
      } else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
        stack.pop()
      } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
        stack.pop()
      } else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
        stack.pop()
      }else{
        return false;
      }

    }


    return stack.isEmpty();

  }
}
