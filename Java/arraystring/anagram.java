class anagram {

  //write a function that determines if two stirng are anargams
  // anagram = nagaram
  // rat != car

public static void main(String[] args){
  String s = "hello";
  String t = "elloh";
  System.out.println(method(s,t));
}


  public static Boolean method(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    int[] counts = new int[26];

    for(int i=0; i<26; i++)
    {
      counts[s.charAt(i) - 'a']++;
    }

    for(int i=0; i<26; i++)
    {
      counts[t.charAt(i) - 'a']--;
      if(counts[t.charAt(i) - 'a'] < 0){
        return false;
      }
    }

    return true;

  }
}
