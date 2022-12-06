import java.util.Arrays;

public class containsduplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
