package factorial;

public class Factorial {

    private int findFactorial(int number){
        return number == 0||number == 1? 1 : number * findFactorial(number - 1);
    }

    public static void main(String[] args){
        System.out.println(new Factorial().findFactorial(5));
    }
}