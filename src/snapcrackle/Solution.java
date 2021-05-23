package snapcrackle;

import java.util.stream.IntStream;

/*From n = 1 to 100, write a program that does the following: 
- if n is divisible by 3 or contains a 3, output the number and the word "snap"
- if n is divisible by 7 or contains a 7, output the number and the word "crackle"
- if n is divisible by 3 or contains a 3 and is divisible by 7 or contains a 7, 
    output the number and the words "snap" and "crackle"*/

public class Solution {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).mapToObj(e->e%3==0 && e%7==0?e+" snap crackle":e%3==0?e+" snap":e%7==0?e+" crackle":e).forEach(System.out::println);
    }
}