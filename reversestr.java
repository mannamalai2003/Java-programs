public class reversestr{
	public static void main(String args[]){
		String str = "arjun";
		char arr[] = str.toCharArray();
		int left = 0;
		int right = str.length()-1;
		while (left<right){
			char a = arr[left];
			arr[left] = arr[right];
			arr[right] = a;
			left++;
			right--;
		}
		String reverse = new String(arr); 
		System.out.println("Reversed string: "+ reverse);
	}
}