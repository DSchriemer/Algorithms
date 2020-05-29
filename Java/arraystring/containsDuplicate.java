class containsDuplicate {

  //Given an array of integeres, find if there are any duplicates

public static void main(String[] args){
  int[] s = new int[1,2,3,4,3]

  System.out.println(method(s));
}


  public static Boolean method(int[] s) {

    HashSet<Integer> set = new HashSet<Integer>();

    for(int i = 0; i < s.length(); i++)
    {
      if set.contains(s[i]){
        reurn true;
      }else{
        set.add(s[i]);
      }
    }

    return false;

  }
}
