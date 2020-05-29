class ReverseString {

public static void main(String[] args){
  String s = "hello";
  System.out.println(reverseString(s));
}


  public static String reverseString(String s) {

    char[] tmp = s.toCharArray();

    int i =0;
    int j = s.length() - 1;

    while(i < j) {
      char temp = tmp[i];
      tmp[i] = tmp[j];
      tmp[j] = temp;
      i++;
      j--;
    }

    return new String(tmp);



  }
}
