package leetcode;

import java.util.Stack;

public class Leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{-6,-5,-2,0};
		int t = -7;
		Solution a = new Solution();
		int[] out = a.twoSum(nums, t);
		System.out.print(out[0]+" "+out[1]);
	
	}

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	Stack s = new Stack();
    	s.clear();
    	if(target < 0) {
    		target = Math.abs(target);
    		for(int i = 0;i < nums.length;i++) {
    			nums[i] = Math.abs(nums[i]); 
    		}
    	}
    	for(int i = 0;i < nums.length;i++) {
    		if(nums[i] <= target) {
    			for(int j = i+1;j < nums.length;j++) {
    				if(nums[i] + nums[j] == target) {
    					s.push(i);
    					s.push(j);
    				}
    			}
    		}
    	}
    	int len = s.size();
    	int[] ret = new int[len];
    	for(int i = len-1;i >= 0;i--) {
    		ret[i] = (int)s.pop();
    	}
        return ret;
    }
}