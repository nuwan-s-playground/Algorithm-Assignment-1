import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = { 10,20,30,40,50};
        int count=0;
        int storage;

        do{
            if(nums.length%2==0){
                storage=nums[count];
                nums[count] = nums[nums.length - 1 - count];
                nums[nums.length-1-count]=storage;

            } else {
                storage=nums[count];
                nums[count] = nums[nums.length - 1 - count];
                nums[nums.length-1-count]=storage;
            }

        } while (count++ + 1 < (nums.length / 2));
        
        System.out.println("The new nums array is "+Arrays.toString(nums));
    }
}
