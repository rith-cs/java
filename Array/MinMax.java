package Array;
public class MinMax {
    public static void main(String[] args){
        int[] nums = {12,5,1,20,30};
        int min = nums[0];
        int max = nums[0];
        for (int v : nums){
            if (v < min) min = v;
            if (v > max) max = v;
        }
        System.out.println(min + " " + max);
    }
}