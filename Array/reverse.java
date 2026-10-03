package Array;
public class reverse {
    public static void main(String[] args){
        int[] nums = {12,5,9,20,7};
        for (int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
}