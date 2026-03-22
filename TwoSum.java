public class TwoSum{
	public static void main(String args[]){
			
		int arr[] = {2,7,11,15};
		int left = 0, right=arr.length-1;
		int target = 18;
		while(left<right ){
			if (arr[left]+arr[right] == target){
				System.out.println("the values of two sum is:"+ left+" "+right);
				return;
			}
			else if(arr[left]+arr[right]>target){
				right--;
			}
			else if(arr[left]+arr[right]<target){
				left++;
			}
			else{
				System.out.println("Element not found");	
			}
		}
	}
}