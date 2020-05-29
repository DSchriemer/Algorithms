class singleOccurance {

  //an array has two of every number except for one of the numbers
  //find that number

public static void main(String[] args){
  int[] s = new int[]{1,2,2,3,3,4,5,4,5}
  System.out.println(method(s));
}


  public static int method(int[] s) {

    HashSet<Integer> counter = new HashSet<Integer>();

    for(int i : nums)
    {
      if (counter.contains(i))
      {
        counter.remove(i);
      }else{
        counter.add(i);
      }
    }

    for(int i : counter)
    {
      return i;
    }

    return -1;

  }
}
