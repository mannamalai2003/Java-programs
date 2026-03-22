public class Valid_palin{
	public static void main(String args[]){
		String str = "nurse run";
		String[] arr = str.split(" ");
		String combined = String.join("",arr);
		char[] arr1 = combined.toCharArray();
		int left = 0; int right=arr1.length-1;
		while (left<right){
			char a = arr1[left];
			arr1[left] = arr1[right];
			arr1[right] = a;
			left++;
			right--;
		}
		String ispalin = new String(arr1);
		System.out.println(combined.equals(ispalin));
	}
}
		 