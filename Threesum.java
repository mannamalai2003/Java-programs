public class Threesum{
	public static void main(String args[]){
			
		int arr[] = {2,7,9,15};
		int left = 0, right=arr.length-1;
		int target = 20;
		for (int i=0;i<arr.length-2;i++){
			while(left<right){
				int sum = arr[i]+arr[left]+arr[right]; 
				if (sum == target){
					System.out.println("the values of two sum is:"+arr[i]+" "+ arr[left]+" "+arr[right]);
					return;
				}
				else if(sum>target){
					right--;
				}
				else if(sum<target){
					left++;
				}
				else{
					System.out.println("Element not found");	
				}
			}
		}
		System.out.println("Number not found");
	}	
}