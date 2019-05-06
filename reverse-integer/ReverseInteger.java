import java.util.Collections;
import java.util.stream.IntStream;

public class ReverseInteger {

    private int reverse(int x){
        int reversed = 0;
        while (x != 0) {
            int temp = reversed * 10 + x % 10;
            x = x / 10;
            if (temp / 10 != reversed) {
                return 0;
            }
            reversed = temp;
        }
        return reversed;
    }

    public static void main(String[] args){
        System.out.println(new ReverseInteger().reverse(-123));
    }
}