package algorithm;
/**
 * First Position of Target
	For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.
	
	If the target number does not exist in the array, return -1.
	
	Example
	If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.
 * @author jiaqgao
 *
 */
public class FirstPositionOfTheTarget {
	
    public int binarySearch(int[] nums, int target) {
      
    		if(nums ==  null || nums.length == 0){
    			return -1;
    		}
    		
    		int start = 0;
    		int end = nums.length - 1;
    		
    		// while(start < end)
    		//while(start <= end)
    		//while(start + 1 <= end)
    		// start = 0; end = 1 o
    		// start = 1; end = 1 o
    		// start = 1; end = 3 x
    		
    		while(start + 1 < end){
    		    // int mid = (start + end)/2;
    		    // start, end -> 2^31 - 1
    			int mid = start +  (end - start)/2;
    			
    			if(nums[mid] == target){
    				end = mid;
    			
    			}else if(nums[mid] < target){
    			    // start = mid + 1
    				start = mid;
    			}else{ // if(A[mid] > target)
    			    // end = mid - 1;
    				end = mid;
    			}
    		}
    		
    		// start, end相等或者相邻
    		//直接当做相邻
    		
    		if(nums[start] == target){
    			return start;
    		}else if ( nums[end] == target){
    			return end;
    		}else{
    			return -1;
    		}
    }

}
