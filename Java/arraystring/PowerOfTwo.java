class PowerOfTwo {

  //Given an integer write a function to determine if it is as power of two

public static void main(String[] args){
  int s = 8;
  System.out.println(method(s));
}


  public static Boolean method(int s) {

    int tmp = 1;

    while(tmp < s)
    {
      tmp *= 2;
    }

    return tmp == s;

  }
}
