public class SquareRoot{

    //works for perfect squares

    private int sqrt(int x){
        int start = 0;
        int end = x;
        
        for(int i = start ; i < end; i++){
            int mid = start + (end - start)/2;
            if((mid * mid) == x){
                return mid;
            }else if((mid * mid) < x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new SquareRoot().sqrt(144));
    }
}