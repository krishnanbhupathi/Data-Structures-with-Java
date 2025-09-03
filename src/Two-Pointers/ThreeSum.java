// problem: https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n -2 ; i++){
            if(i == 0 || (i > 0 && nums[i]!=nums[i-1])){
                int start = i + 1, end = n-1;
                int target = -nums[i];
                while(start < end){
                    int sum = nums[start] + nums[end];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while (start < end && nums[start] == nums[start+1])
                            start++;
                        while(start < end && nums[end] == nums[end-1])
                            end--;
                        start++;
                        end--;
                    }else if(sum < target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] num = {-1,0,1,2,-1,-4};
        int[] arr = {0,1,1};
        System.out.println(threeSum(num));
        System.out.println(threeSum(arr));
    }
}
