import java.awt.List;
import java.util.ArrayList;

public class BuzzFizz {
/*
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
*/
    private ArrayList<Object> createMagic(int n){
        ArrayList<Object> tempList = new ArrayList<>();
        for(int i = 1; i <= n; i ++){
                if(i % 3 == 0){
                    tempList.add("Fizz");
                }else if(i % 5 == 0){
                    tempList.add("Buzz");
                }else if((i % 3 == 0 && i % 5 == 0)){
                    tempList.add("BuzzFizz");
                }else{
                    tempList.add(String.valueOf(i));
                } 
        }
        return tempList;
    }


    public static void main(String[] args) {
        System.out.println(new BuzzFizz().createMagic(11));
    }
}