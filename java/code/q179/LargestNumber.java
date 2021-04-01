package code.q179;

/**
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        int temp;
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < nums.length - 1;i++){
            for(int j = i + 1; j < nums.length;j++){
                if(compare(nums[i],nums[j]) < 0){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        if(nums[0] == 0){
            return "0";
        }

        for(Integer num:nums){
            res.append(num);
        }

        return res.toString();
    }

    private int compare(int x,int y){
        String a = "" + x +y;
        String b = "" + y +x;
        return a.compareTo(b);
    }
}
