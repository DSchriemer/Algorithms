class Interviews
{

  //Given a string, return true if each char in the string is unqiue
  static boolean isUnique(String sentence)
  {
    if(sentence.length() > 128)
    {
      return false;
    }

    boolean[] charArray = new boolean[256]; //Assumtion of extended ASCII

    for(int i = 0; i<sentence.length(); i++)
    {
        int value = sentence.charAt(i); //ASCII value
        if (charArray[value])
        {
          return false;
        }
        charArray[value] = true;
    }
    return true;
  }


  //given two strings, determine if each has the same amount of each character
  static boolean sameLetters(String a, String b)
  {
    if(a.length() != b.length())
    {
      return false;
    }

    int[] letters = new int[256];
    char[] a_array = a.toCharArray(); //converts a string into an a_array

    for (char c : a_array)
    {
      letters[c] = letters[c] + 1;
      //Count number of characters in a_array
    }

    //now we have all each number of occurences of each letter in a_array

    for (int i = 0; i < b.length(); i++)
    {
      int character = b.charAt(i);
      letters[character]--;
      if (letters[character] < 0)
      {
        System.out.println(b.charAt(i));
        return false;
      }
    }

    return true;
  }




  public static void main(String[] args)
  {
    String str = "team";
    System.out.println("Original string is: " + str);

    if(isUnique(str))
    {
      System.out.println("unique!");
    }


    if(sameLetters("bravo", "ovrba"))
    {
      System.out.println("palindrome!");
    }

  }
}
