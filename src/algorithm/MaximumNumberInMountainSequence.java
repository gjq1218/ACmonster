package algorithm;
/**
 * Given a mountain sequence of n integers which increase firstly and then decrease, find the mountain top.
 * 
	Example 
	Given nums = [1, 2, 4, 8, 6, 3] return 8
	Given nums = [10, 9, 8, 7], return 10

 * @author jiaqgao
 *
 */
public class MaximumNumberInMountainSequence {
   
	public int mountainSequence (int[] nums) {
      
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		
		while( left < right){
			
			mid = left + (right - left)/2;
			if(nums[left] < nums[mid]){
				left = mid;
			}else{
				right = mid;
			}
		}
		
		return nums[mid];
   }
	public static void main(String args[]){
	//	int[] nums = {1,2,4,8,6,3};
		int[] nums2 = {10, 9, 8, 7};
		MaximumNumberInMountainSequence test = new MaximumNumberInMountainSequence();
		int res = test.mountainSequence(nums2);
		System.out.println(res);
	}

}
