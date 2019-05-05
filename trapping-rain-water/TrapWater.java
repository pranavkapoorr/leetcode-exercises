import java.util.Arrays;

public class TrapWater{

    /** 
     *                     __
     *         __.........|  |__....__
     *   __...|  |__    __|  |  |__|  |__
     *__|  |__|  |  |__|  |  |  |  |  |  |
     * 
     *  [0,1,0,2,1,0,1,3,2,1,2,1]
     **/

    private void findTrappedWater(){
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int water = 0;
        int[] leftHighest = new int[heights.length + 1];
        leftHighest[0] = 0;        
        for (int i = 0; i < heights.length; i++) {
            leftHighest[i + 1] = Math.max(leftHighest[i], heights[i]);            
        }
        System.out.println(Arrays.toString(leftHighest));
        int rightHighest = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            rightHighest = Math.max(heights[i], rightHighest);
            water += Math.min(leftHighest[i], rightHighest) > heights[i] ? Math.min(leftHighest[i], rightHighest) - heights[i] : 0;            
        }
        System.out.println(water);
    }

    public static void main(String[] args){
        new TrapWater().findTrappedWater();
    }
}