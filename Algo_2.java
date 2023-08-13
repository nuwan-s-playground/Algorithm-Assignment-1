public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = { -5, 2, 7, 10, 58, -7, 8, 23 };
        int index = 1;
        int minNum = 0;
        int maxNum = 0;

        do {
            if (index == 1) {
                if (nums[index] > nums[index-1]) {
                    maxNum = nums[index];
                    minNum = nums[index + 1];
                }else{
                    maxNum = nums[index-1];
                    minNum = nums[index]; 
                }
            } else {
                if (nums[index] > maxNum) {
                    maxNum = nums[index];
                } else {
                    if (minNum > nums[index]) {
                        minNum = nums[index];
                    } 
                }
            }
        } while ((index++ + 1) < nums.length);
        System.out.println("Smallest number is "+ minNum +".");
        System.out.println("Largest number is "+ maxNum +".");
    }
}
