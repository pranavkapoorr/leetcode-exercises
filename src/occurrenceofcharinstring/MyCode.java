// Count the number of Duplicates
// Write a function that will return the count of distinct case-insensitive 
// alphabetic characters and numeric digits that occur more than once in the 
// input string. The input string can be assumed to contain only alphabets 
// (both uppercase and lowercase) and numeric digits.
// Example
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
// "indivisibility" -> 1 # 'i' occurs six times
// "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
// "aA11" -> 2 # 'a' and '1'
// "ABBA" -> 2 # 'A' and 'B' each occur twice
package occurrenceofcharinstring;
import java.util.*;

public class MyCode {
	public static void main (String[] args) {
		new MyCode().duplicateCount("aabbcde");
    new MyCode().duplicateCount("indivisibility");
	}
  private void duplicateCount(String str){
    Map<Character,Integer> data = new HashMap<>();
    for(char ch : str.toCharArray()){
        if(data.containsKey(ch)){
          data.put(ch,data.get(ch) + 1);
        }else{
          data.put(ch,1);
        }
    }
    
    data.forEach((c,o)-> {
      if(o>1){
        System.out.println("character: "+c+" occuring-> "+o+" times");
      }
      });
    
    System.out.println(str);
  }
}
