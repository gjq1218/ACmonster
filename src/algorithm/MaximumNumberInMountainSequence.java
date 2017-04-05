package algorithm;
/**
 * Given a mountain sequence of n integers which increase firstly and then decrease, find the mountain top.
 * 
	Example 
	Given nums = [1, 2, 4, 8, 6, 3] return 8
	Given nums = [10, 9, 8, 7], return 10
	Note here is only one moutain

	// thinking: 1. The number is increasing, and the mid is located before top.

				2. The number is decreasing, the mid is located after top.
				
				When mid is smaller than start, there is only one situation, top is in the left half.
				
				思考的时候，可以把问题具象话，想象真的有一座山，中间的值在山的左边还是右边。考虑清楚之后，就可以舍弃一半的数了。
 *
 */
public class MaximumNumberInMountainSequence {
   
	public int mountainSequence (int[] nums) {
      
		int left = 0;
		int right = nums.length - 1;
		
		while( left + 1 <  right){			
			int mid = left + (right - left)/2;
			int mid2 = right - (right - mid)/2;
			if(nums[mid] < nums[mid2]){
				left = mid + 1;
			}else if( nums[mid] > nums[mid2]){
				right = mid2 -1;
			}else{
				left = mid;
				right = mid2;
			}
		}
		return nums[left] > nums[right] ? nums[left] : nums[right];
   }
	
	public static void main(String args[]){
		int[] nums2 = {1,2,4,8,6,3};
		//int[] nums2 = {10, 9, 8, 7};
		MaximumNumberInMountainSequence test = new MaximumNumberInMountainSequence();
		int res = test.mountainSequence(nums2);
		System.out.println(res);
	}

}
