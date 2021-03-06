package occurrenceofcharinstring;

import java.util.*;

public class Solution {
	public boolean isRepeated(char ch, String str) {
		Map<Character,Integer> data = findOccurences(str);
		return data.containsKey(ch) ? data.get(ch) > 1 ? true : false : false;
	}
	public int timesRepeated(char ch, String str) {
		Map<Character,Integer> data = findOccurences(str);
		return data.containsKey(ch) ? data.get(ch) : 0;
	}
	public void showOccurences(String str) {
		Map<Character,Integer> data = findOccurences(str);
		data.forEach((ch,o) -> System.out.println(ch + " -> " + o +" times"));
	}
	private Map<Character,Integer> findOccurences(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().isRepeated('o',"Hello"));
		System.out.println(new Solution().timesRepeated('l',"Hello"));
		new Solution().showOccurences("Hello");
	}
}
