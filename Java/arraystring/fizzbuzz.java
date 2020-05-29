class fizzbuzz {

  //write a function that outputs  a string from 1 to n
  //if the number is divisible by 3 it should output fizz instead
  //if it is divisible by 5 outbut fizzbuzz
  //if by both output fizzbuzz
  //1,2,fizz,4,buzz,ect



public static void main(String[] args){
  int s = 5
  System.out.println(method(s));
}


  public static String method(int s) {

    for(int i = 1; i <=s; i++){

      if ((i % 3) == 0){
        System.out.print("fizz");
      }
      if ((i % 5) == 0){
        System.out.print("buzz");
      }else{
        System.out.print(i);
      }
      System.out.println();
    }


    return new String(tmp);

  }
}
