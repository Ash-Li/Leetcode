import java.util.Stack;
/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
*/

public class reverse_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int b = 1534236469;
		Solution s = new Solution();
	//	System.out.print(Integer.MAX_VALUE *8);
		 System.out.print(s.reverse(b));
	}

}
class Solution {
    public int reverse(int x) {
    	int ret = 0;
    	int last;
    	while(x != 0) {
    		last = x %10;
    		if(ret > Integer.MAX_VALUE/10 || ret < Integer.MIN_VALUE/10) return 0;
    		ret = ret*10 + last;
    		x = x/10;
    	}
        return ret;
    }
}