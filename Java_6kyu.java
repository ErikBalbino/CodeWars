//Split Strings
//Complete the solution so that it splits the string into pairs of two characters. If //the string contains an odd number of characters then it should replace the missing //second character of the final pair with an underscore ('_').

public static String[] solution(String s) {
      LinkedList<String> lista = new LinkedList<String>();
      if (s.length()%2 != 0) {
        s = s+"_";
      }
      for (int i = 0; i < (s.length()); i = i+2) {
        String elemento = s.substring(i , i+2);
        lista.add(elemento);
      }
      String[] stringArray = lista.toArray(new String[0]);
      return stringArray;
    }

//The goal of this exercise is to convert a string to a new string where each //character in the new string is "(" if that character appears only once in the //original string, or ")" if that character appears more than once in the original //string. Ignore capitalization when determining if a character is a duplicate.
//
//Examples
//"din"      =>  "((("
//"recede"   =>  "()()()"
//"Success"  =>  ")())())"
//"(( @"     =>  "))((" 

import java.lang.String;
public class DuplicateEncoder {
	static String encode(String word){
    String nWord = "";
    for (int i = 0; i == word.length; i++) {
      if (word[i].equals('(') or nWord.contais(word[i])) {
        nWord = nWord+')';
      } else {
        nWord = nWord+'(';
      }
    }
    System.out.print(word);
    return word;
  }
}

public class principal { 
    public static void main(String args) {
    System.out.println(DuplicateEncoder("Prespecialized"))
    }
}