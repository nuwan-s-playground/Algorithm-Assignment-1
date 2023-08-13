import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int[] oppositeSequensce = new int[nums.length ];
        int count =0;
        do {
            oppositeSequensce[(nums.length-1)-count]=nums[count];

        } while (count++ + 1 < nums.length);
        nums = oppositeSequensce;
        System.out.println(Arrays.toString(nums));
        
    }
}
